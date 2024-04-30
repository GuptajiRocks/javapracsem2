package jan21;
import java.util.Scanner;
public class two {
    public static int fact(int j) {
        if((j==0) || (j==1)) {
            return 1;
        } else {
            return j*fact(j-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int finres = fact(j);
        System.out.println(finres);
    }
}
