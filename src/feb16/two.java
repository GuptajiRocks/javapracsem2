package feb16;
import java.util.Scanner;
public class two {
    public static void c1() {
        Scanner sc = new Scanner(System.in);
        //Program for determinant calculation
        int[][] arr1 = new int[2][2];
        int[] arr2 = new int[2];
        //System.out.println(arr1.length);
        for(int i = 0; i<arr1.length; i++) {
            for(int j = 0; j<arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int k = 0; k<1; k++) {
            arr2[k] = arr1[k][k]*arr1[k+1][k+1];

        }

    }
    public static void main(String[] args) {
        c1();
    }
}
