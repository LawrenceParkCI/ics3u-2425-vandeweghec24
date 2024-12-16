package unit2;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: This program demonstrates writing text to a file.
 * Date: November 28, 2024
 * @author Caden
 */

public class DemoWriting {
	public static void main(String[] args) {
		// The file to write to
		String fileName = "output.txt";

		try {
			// Create a FileWriter object for writing to the file
			FileWriter writer = new FileWriter(fileName);

			// Write content to the file
			writer.write("Hello, world!\n");
			writer.write("This is a demo of writing to a file using Java.\n");
			writer.write("Each call to writer.write() appends to the file.\n");

			// Close the FileWriter to save changes
			writer.close();

			// Notify the user
			System.out.println("File written successfully to " + fileName);
		} catch (IOException e) {
			// Handle any errors that occur
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}
