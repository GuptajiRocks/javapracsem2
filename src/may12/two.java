//This is a very useful program to teach about nested if else, string equality
package may12;
import java.util.Scanner;
public class two {
    static Scanner sc = new Scanner(System.in);
    public static String engg() {
        System.out.println("Does it move?:  ");
        String ini = sc.next();
        if (ini.equals("yes")) {
            System.out.println("Should It: ");
            String ini1 = sc.next();
            if (ini1.equals("yes")) {
                System.out.println("No problem");
                return "Works good";
            } else {
                return "DUCT TAPE";
            }
        } else if (ini.equals("no")) {
            System.out.println("Should It?: ");
            String ini2 = sc.next();
            if (ini2.equals("no")) {
                System.out.println("No problem");
                return "Works good";
            } else {
                return "WD-40";
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String res = engg();
        System.out.println(res);
        sc.close();        
    }
    
}
