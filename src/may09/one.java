package may09;
import java.util.Scanner;
class notfunny extends Exception {
    notfunny(String message) {
        super(message);
    }
}
public class one {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] arr1 = new int[2];
    //     try{
    //         for(int i = 0; i<5; i++) {
    //             arr1[i] = sc.nextInt();
    //         }
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     sc.close();
    // }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter age: ");
            int a = sc.nextInt();
            if (a <18) {
                throw new notfunny("Your age is less");
            }
        } catch (notfunny n) {
            System.out.println(n.getMessage());
        }
    }
}
