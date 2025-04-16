import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class students {
    int id;
    String name;
    int age;

    public students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(id + ", " + name + ", " + age);
    }

    public String toString() {
        return id + ", " + name + ", " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        students student1 = new students(1, "CYIZA Henriette", 24);
        students student2 = new students(3, "Michael Henriette", 25);
        students student3 = new students(4, "Richard Henriette", 25);
        students student4 = new students(5, "Richard Henriette", 25);

        String filePath = "C:\\Users\\USER\\Documents\\GitHub\\java\\file_read_write\\lizard.txt";

        // Step 1: Write students to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(student1.toString());
            writer.write(student2.toString() );
            writer.write(student3.toString() );
            writer.write(student4.toString() );
            writer.write("This is a test file.\n");
            writer.write("This is a test file.\n");
            writer.write("This is a test file.\n");
            System.out.println("Students written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } 

        // Step 2: Read students from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading students from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
