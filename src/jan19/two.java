package jan19;
import java.util.Scanner;
public class two {
    public static void n1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String nm = sc.nextLine();
        System.out.print("Enter Physics Marks: ");
        float phy = sc.nextFloat();
        System.out.print("Enter Chemistry Marks: ");
        float chem = sc.nextFloat();
        System.out.print("Enter Maths Marks: ");
        float maths = sc.nextFloat();
        float avg = (phy+chem+maths) / 3;
        System.out.print(nm+" has an average marks of: ");
        System.out.printf("%.2f", avg);
    }
    public static void q1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        

    }
    public static void main(String[] args) {
        n1();
    }
}
