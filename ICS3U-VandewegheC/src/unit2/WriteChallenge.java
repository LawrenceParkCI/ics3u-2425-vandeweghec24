package unit2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteChallenge {
  public static void main(String[] args) {
    // Scanner for user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user how many grades they want to enter
    System.out.print("How many grades do you want to enter? ");
    int numGrades = scanner.nextInt();
    
    // Create a File object to write into "grades.txt"
    File file = new File("grades.txt");

    try (FileWriter writer = new FileWriter(file)) {
      // Loop to ask the user for each grade and write it to the file
      for (int i = 1; i <= numGrades; i++) {
        System.out.print("Enter grade " + i + ": ");
        int grade = scanner.nextInt();
        writer.write(grade + "\n"); // Write grade on a new line
      }
      System.out.println("Grades have been saved to grades.txt");
    } catch (IOException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    } finally {
      // Close the scanner
      scanner.close();
    }
  }
}
