package feb25;
import java.util.Scanner;
public class two {
    static int res = 10;
    public static int pow(int k) {
        for(int i = 0; i<k; i++) {
            res = res * res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a1 = sc.nextDouble();
        int l1 = a1.toString().length();
        int f1 = l1-1;
        //int x = pow(f1);
        System.out.println();

        //System.out.println((a1*x)+" paise");
    }

}
