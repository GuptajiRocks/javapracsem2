package apr22.filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class arihantquesfour {
    public static void main(String[] args) throws IOException {
        //Code written by Arihant Gupta - E23CSE0055
        String filePath = "D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\5.txt";  // Replace with your actual file path


        System.out.println("Writing with writeString (Java 11+):");
        writeStringToFile(filePath, "Arihant from writeString!");

        // Write using FileWriter (basic character-oriented)
        System.out.println("\nWriting with FileWriter:");
        writeToFileWithFileWriter(filePath, "Arihant from FileWriter!");

        // Write using BufferedWriter (improved performance)
        System.out.println("\nWriting with BufferedWriter:");
        writeToFileWithBufferedWriter(filePath, "Arihant from BufferedWriter!");
    }

    private static void writeStringToFile(String filePath, String content) throws IOException {
        // Requires Java 11 or above
        Files.writeString(Paths.get(filePath), content);
    }

    private static void writeToFileWithFileWriter(String filePath, String content) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }

    private static void writeToFileWithBufferedWriter(String filePath, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(content);
        writer.close();
    }
}
