import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is my first file in Java!\n");
            writer.write("File handling is easy.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("\nReading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}