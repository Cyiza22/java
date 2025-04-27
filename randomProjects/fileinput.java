package randomProjects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class fileinput {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\USER\\Documents\\GitHub\\java\\file_read_write\\student.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileLocation, true))) {
            String ln = "Hello World!";
            bw.write(ln +"\n");
            bw.write("Hello from Backend!" + "\n");
            bw.write("Hello from push!" + "\n");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
