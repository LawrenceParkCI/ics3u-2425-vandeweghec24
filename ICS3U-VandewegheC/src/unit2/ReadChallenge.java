package unit2;
import java.io.*;
import java.util.Scanner;

/**
 * Description: Reads grades from a file named "grades.txt" and calculates the average.
 * Date: Dec. 1, 2024
 * @author Caden Vandeweghe
 */

public class ReadChallenge {
  public static void main(String[] args) {
    String fileName = "grades.txt"; // Name of the file to read
    int sum = 0;                   // Sum of the grades
    int count = 0;                 // Number of grades

    try {
      // Create a File object
      File file = new File(fileName);

      // Create a Scanner to read the file
      Scanner fileScanner = new Scanner(file);

      System.out.println("Reading grades from the file:");

      // Loop through each line in the file
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine(); // Read a line

        // Try to parse the line as an integer (a grade)
        try {
          int grade = Integer.parseInt(line.trim()); // Convert to integer
          System.out.println("Grade: " + grade);    // Print the grade
          sum += grade;                             // Add to the sum
          count++;                                  // Increment the count
        } catch (NumberFormatException e) {
          System.out.println("Invalid entry skipped: " + line);
        }
      }

      // Close the file scanner
      fileScanner.close();

      // Calculate and display the average
      if (count > 0) {
        double average = (double) sum / count;
        System.out.printf("The average grade is: %.2f\n", average);
      } else {
        System.out.println("No valid grades found in the file.");
      }

    } catch (FileNotFoundException e) {
      System.out.println("The file " + fileName + " was not found.");
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file.");
    }
  }
}
