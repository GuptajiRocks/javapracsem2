package apr27;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class one {
    public static void main(String[] args) throws IOException {
        File obj1 = new File("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr27\\1.txt");
        Scanner sc = new Scanner(obj1);
        System.out.println(sc.nextLine());
        System.out.println(sc.next());
        //System.out.println(sc.next());
        System.out.println();
        sc.close();
        
    }

    
}
