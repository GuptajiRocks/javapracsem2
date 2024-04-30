package jan29;
import java.util.Scanner;
public class two {
    public static void q1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean c1 = a>10;
        switch(a) {
            case 5:
                System.out.println("Number is 5");
                break;
            case 6:
                System.out.println("Billo bagge");
                break;
            //case c1:
                //System.out.println("Greater than 10");

            default:
                System.out.println("Bye");
                break;
        }
    }
    public static void q2() {
        for(int i=1;i<5;i++) {
            System.out.println("Why: "+i);
        }
    }
    public static void dl1() {
        for(int i=10,j=20;i<20 && j >10;i++,j--) {
            System.out.print(i);
            System.out.print(j);
            System.out.println(": "+(i+j));
        }
    }
    public static void dl2() {
        int a;
        float b;
        for(a=10,b=20.0f;a<20 && b>10;a++,b--) {
            System.out.println(a+b);
        }
    }
    public static void dl3() {
        
    }
    public static void main(String[] args) {
        dl2();

    }
}
