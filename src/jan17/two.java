package jan17;
import java.util.Scanner;
public class two {
    public static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        //System.out.println();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.println(String.format("%.1f",a+b));
    }
    public static void main(String[] args) {
        q2();
    }
}
