package feb26;
import java.util.Scanner;
public class three {
    public static void c1(){
        int x = (int)10.9f;
        System.out.println(x);
        String s1 = "10.5";
        System.out.println(s1.indexOf("."));
    }
    public static void c2() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
    }
    public static void c3() {
        int i = Integer.parseInt("111",2);
        System.out.println(i);
    }


    public static void main(String[] args) {
        c3();

    }

}
