package file_read_write;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        students student1 = new students(1, "CYIZA Henriette", 24);
        students student2 = new students(3, "Michael Henriette", 25);
        students student3 = new students(4, "Richard Henriette", 25);
        students student4 = new students(5, "Richard Henriette", 25);
        student1.print();
        student2.print();
        student3.print();
        student4.print();
        String fileLocation = "C:\\Users\\USER\\Documents\\GitHub\\java\\file_read_write\\student.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation , true))) {
            writer.write(student1.toString() + "\n");
            writer.write(student2.toString() + "\n");
            writer.write(student3.toString() + "\n");
            writer.write(student4.toString() + "\n");
            System.out.println("Students written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Step 2: Read students from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            System.out.println("\nReading students from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}