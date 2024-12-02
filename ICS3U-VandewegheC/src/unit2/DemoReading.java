package unit2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Description: A program to demonstrate reading text from a file.
 * Date: Dec. 1, 2024
 * Author: Caden Vandeweghe
 */

public class DemoReading {
    public static void main(String[] args) {
        // Create a String variable to hold each line of text
        String line;

        try {
            // Attempt to open and read from the input.txt file
            File file = new File("input.txt");

            // Check if the file exists
            if (!file.exists()) {
                System.out.println("File does not exist: " + file.getAbsolutePath());
                return;
            }

            // Create a Scanner to read from the file
            Scanner fsc = new Scanner(file);

            // Read each line until there are no more lines
            while (fsc.hasNextLine()) {
                line = fsc.nextLine(); // Read the next line
                System.out.println(line); // Print the line
            }

            // Close the Scanner
            fsc.close();
        } catch (IOException e) {
            // Handle any file-related exceptions
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}


