package jan23;
import java.util.Scanner;
public class one {
    public static void q1() {
        char a = 'a';
        int sf = 123;
        StringBuilder sd = new StringBuilder("123");
        int c = (int)sd.charAt(0);
        int y = c+1;
        System.out.println(y);
    }
    public static void q2() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s+2);
        boolean abv = sc.nextBoolean();
    }
    public static void main(String[] args) {
        q2();

    }
}
