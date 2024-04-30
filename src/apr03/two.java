package apr03;
import java.util.Scanner;
import java.util.Stack;

public class two {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        for(int x = 0; x<5; x++) {
            int res = 1/(1-(x)-(x*x));
            s1.add(res);
        }
        System.out.println(s1);

    }
}
