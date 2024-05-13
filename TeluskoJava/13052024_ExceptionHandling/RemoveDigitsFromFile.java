import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveDigitsFromFile {
    public static void main(String[] args) {
        String inputFileName = "input.txt"; // Change this to the path of your input file
        String outputFileName = "output.txt"; // Change this to the path of your output file

        removeDigits(inputFileName, outputFileName);
    }

    public static void removeDigits(String inputFileName, String outputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("new.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("new1.txt"))) {

                    String line;
                    while ((line = reader.readLine()) != null) {
                        // Replace "::" with newline character "\n"
                        String modifiedLine = line.replaceAll("::", "\n");
                        writer.write(modifiedLine);
                        writer.newLine(); // Add a new line after each line
                    }

            System.out.println("Digits removed successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
