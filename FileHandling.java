import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

        String fileName = "example.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a basic example of file handling in Java!");
            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            System.out.println("Data read from the file: " + line);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
