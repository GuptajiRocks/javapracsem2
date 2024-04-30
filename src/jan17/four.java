package jan17;
import java.util.Scanner;
public class four {
    public static void c1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = (a+b+c)/2;
        int ures = s*(s-a)*(s-b)*(s-c);
        double finres = Math.pow(ures,0.5);
        System.out.printf("%.2f",finres);
    }
    public static void main(String[] args) {
        c1();
    }
}
