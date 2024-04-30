package mar07;
import java.util.Scanner;
//Scanner class imported
public class three {
    public static int[][] matrix_multiply(int[][] a1, int[][] a2 ) {
        //Created a function to multiply matrices
        int[][] k1 = new int[a1.length][a2[0].length];
        if(a1[0].length != a2.length) {
            //checking conditions that if matrix multiplication would be possible or not
            return null;
        } else {
            for(int i = 0; i<a1[0].length; i++) {
                for(int j = 0; j<a2.length; j++) {
                    for(int k = 0; k<a1.length; k++) {
                        k1[i][j] = a1[i][k] * a2[j][k];
                        //Running three simultaneous loops to actually multiply matrices
                    }
                }
            }
        }
        return k1;
        //Returned a 2-dimensional array in the method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Created a scanner object

        int nr1 = sc.nextInt();
        int nc1 = sc.nextInt();
        int nr2 = sc.nextInt();
        int nc2 = sc.nextInt();
        int nr3 = sc.nextInt();
        int nc3 = sc.nextInt();
        //After getting the input of the dimensions arrays have been created
        int[][] arr1 = new int[nr1][nc1];
        int[][] arr2 = new int[nr2][nc2];
        int[][] arr3 = new int[nr3][nc3];

        for(int i = 0; i<nr1; i++) {
            for(int j = 0; j<nc1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<nr1; i++) {
            for(int j = 0; j<nc1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<nr1; i++) {
            for(int j = 0; j<nc1; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }
        int[][] resf = matrix_multiply(arr1,arr2);
        int[][] res = matrix_multiply(resf,arr3);

        for(int i = 0; i<res.length; i++) {
            for(int j = 0; j<res[0].length; j++) {
                System.out.println(res[i][j]);
            }
        }


    }
}
