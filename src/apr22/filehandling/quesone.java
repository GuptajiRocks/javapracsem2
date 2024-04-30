package apr22.filehandling;
import java.util.*;
import java.io.*;

public class quesone{
    //E23CSEU0055
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\2.txt");
        Scanner sc = new Scanner(f1);
        FileWriter w1 = new FileWriter("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\22.txt");
        w1.write(sc.nextLine());
        w1.close();
        sc.close();
    }
}


