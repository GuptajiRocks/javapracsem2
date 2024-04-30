package feb16;
import java.util.Scanner;
public class one {
    static int[] getSaS(int a, int b) {
        int[] ans = new int[2];
        ans[0] = a+b;
        ans[1] = a-b;

        return ans;
    }
    public static void main(String[] args) {
        int[] res = getSaS(50,100);
        System.out.println(res[0]);

    }
}
