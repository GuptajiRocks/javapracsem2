package mar18;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
        } catch(IndexOutOfBoundsException e){
            System.out.println(e);

        }
    }
}
