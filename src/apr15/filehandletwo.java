package apr15;

import java.io.*;

public class filehandletwo {

    public static void main(String[] args) throws IOException {
        // Check for command-line arguments
        String inputFile = "D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr15\\three.txt";
        String outputFile = "D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr15\\four.txt";

        // Enhanced error handling with resource management
        try (FileReader in = new FileReader(inputFile);
             FileWriter out = new FileWriter(outputFile)) {
            // Read and write characters using BufferedReader and BufferedWriter
            BufferedReader reader = new BufferedReader(in);
            BufferedWriter writer = new BufferedWriter(out);

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line character after each line
            }

            System.out.println("File copied successfully!");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }

    }
}

