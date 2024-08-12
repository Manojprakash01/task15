package divi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class qus4 {

	public static void main(String[] args) {
        // Define the file path (change this to the path of the file you want to read)
        String filePath = "nonexistentfile.txt"; // Example of a file that does not exist

        // Create a File object
        File file = new File(filePath);

        // Attempt to read the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            // Read and print file content
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle the case where the file does not exist
            System.out.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            // Handle other I/O exceptions
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }
}
