package jan30;
import java.util.Scanner;
public class one {
    public static void c1() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a;
        do{
            System.out.print("Enter Marks: ");
            a = sc.nextInt();
            sum = sum+a;
        } while(a>=0);

        System.out.println(sum);

    }
    public static void main(String[] args) {
        c1();
    }
}
