package jan21;
import java.util.Scanner;
//Program to calculate power
public class one {
    public static int power(int j, int k) {
        int res = 1;
        for(int i = 0;i<k;i++) {
            res = res*j;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int k = sc.nextInt();
        int finres = power(j,k);
        System.out.println(finres);
    }

}
