package AverageAgeCSVStreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVStreamProcessor {

    public static double calculateAverageAge(String csvFilePath) throws IOException {
        List<Integer> ages = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    // Skip the header row (Name,Age)
                    isFirstLine = false;
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length < 2) continue; // Skip malformed lines

                try {
                    int age = Integer.parseInt(parts[1].trim());
                    ages.add(age);
                } catch (NumberFormatException e) {
                    // Skip invalid age values (e.g., non-numeric)
                    System.out.println("Skipping invalid age: " + parts[1]);
                }
            }
        }

        return ages.stream()
                   .mapToInt(Integer::intValue)
                   .average()
                   .orElse(0.0); // Default to 0.0 if no valid ages
    }


}
