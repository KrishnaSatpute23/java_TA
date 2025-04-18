
import java.io.*;

class InvalidInputException extends Exception {
    InvalidInputException(String msg) {
        super(msg);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            if (!file.exists()) {
                throw new InvalidInputException("File does not exist!");
            }
            FileReader fr = new FileReader(file);
        } catch (InvalidInputException | FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
