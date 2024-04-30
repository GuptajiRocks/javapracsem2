package apr22.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arihantquesfive {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java FindPatternInFile filePath pattern");
            return;
        }

        String filePath = "D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\6.txt";
        String patternString = "one";

        // Compile the pattern for efficiency
        Pattern pattern = Pattern.compile(patternString);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(line);
                }
            }
        }
    }
}
