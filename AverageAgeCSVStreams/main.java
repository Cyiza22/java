package AverageAgeCSVStreams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String pathToCSV = "people.csv";

        try {
            double averageAge = CSVStreamProcessor.calculateAverageAge(pathToCSV);
            System.out.printf("Average Age: %.2f%n", averageAge);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    
}
