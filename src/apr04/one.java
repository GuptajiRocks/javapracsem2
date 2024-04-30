package apr04;

import java.util.Scanner;
class calculate{
    void sinmul(double a, double b) {
        double res = Math.sin(Math.toRadians(a))*Math.sin(Math.toRadians(b));
        System.out.format("The result of multiplication of sin is:%.4f\n",res);
    }
    void cosmul(double a, double b) {
        double res = Math.cos(Math.toRadians(a))*Math.cos(Math.toRadians(b));
        System.out.format("The result of multiplication of cos is:%.4f\n",res);
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculate c1 = new calculate();
        System.out.println("Press 1 for carrying out multiplication operation on sin values of given input values");
        System.out.println("Press 2 for carrying out multiplication operation on cos values of given input values");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Enter first input value");
            double a = sc.nextDouble();
            System.out.println("Enter second input value");
            double b = sc.nextDouble();
            c1.sinmul(a,b);
        } else if(choice == 2) {
            System.out.println("Enter first input value");
            double a = sc.nextDouble();
            System.out.println("Enter second input value");
            double b = sc.nextDouble();
            c1.cosmul(a,b);

        }

    }
}