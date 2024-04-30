package feb25;
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = s1.replace(".","");
        int x = Integer.parseInt(s2);
        System.out.println(x+" paise");
    }

}
