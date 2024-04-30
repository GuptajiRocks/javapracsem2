package feb27;
import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of balls");
        int N = sc.nextInt();
        System.out.println("Enter number of boxes");
        int m = sc.nextInt();
        int count = 0;
        //int[] arr1 = new int[m];
        if(N>0 && m>0) {
            for(int i = 1; i<m+1; i++) {
                count = count + i;
            }
            if (count == N) {
                System.out.println("Possible");
            } else {
                System.out.println("Not possible");
            }
            }
        else{
            System.out.println("Error");
        }
    }
}
