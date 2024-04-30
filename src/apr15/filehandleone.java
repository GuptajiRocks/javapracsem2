package apr15;
import java.io.*;
import java.util.Scanner;
public class filehandleone {
    public static void main(String[] args) throws IOException {
        File obj1 = new File("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr15\\one.txt");
        File obj2 = new File("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr15\\two.txt");
        Scanner sc1 = new Scanner(obj1);
        FileWriter out = new FileWriter(obj2);
        out.write(sc1.nextLine());
        out.close();

    }
}
