package apr22.filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class arihantquesthree {



        public static void main(String[] args) throws IOException {
            String filePath = "D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\4.txt"; // Replace with your actual file path

            // Read using FileReader (basic, less efficient)
            System.out.println("\nReading with FileReader:");
            readFileWithFileReader(filePath);

            // Read using BufferedReader (improved performance)
            System.out.println("\nReading with BufferedReader:");
            readFileWithBufferedReader(filePath);

            // Read using Scanner (flexible, can parse data)
            System.out.println("\nReading with Scanner:");
            readUsingScanner(filePath);
        }

        private static void readFileWithFileReader(String filePath) throws IOException {
            FileReader reader = new FileReader(filePath);
            int charRead;

            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }

            reader.close();
        }

        private static void readFileWithBufferedReader(String filePath) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //Code written by Arihant Gupta - E23CSEU0055

            reader.close();
        }

        private static void readUsingScanner(String filePath) throws IOException {
            Scanner scanner = new Scanner(new FileReader(filePath));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        }


}
