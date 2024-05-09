package may08;
import java.util.Scanner;
public class four {
    public static int[][] matrixMultiply(int[][] a1, int[][] a2) {
        int[][] res = new int[a1.length][a2[0].length];
        if(a1[0].length != a2.length) {
            return null;
        } else {
            for(int i = 0; i<a1.length; i++) {
                for(int j = 0; j<a2[0].length; j++) {
                    for(int k = 0; k<a2.length; k++) {
                        res[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows1 = sc.nextInt();
        System.out.println("Number of columns: ");
        int column1 = sc.nextInt();
        int[][] a1= new int[rows1][column1];
        System.out.println("Enter number of rows: ");
        int rows2 = sc.nextInt();
        System.out.println("Number of columns: ");
        int column2 = sc.nextInt();
        int[][] a2 = new int[rows2][column2];
        int[][] a3 = matrixMultiply(a1, a2);     
        
        for(int[] i : a3) {
            System.out.println();
            for(int k : i) {
                System.out.print(k+" ");
            }
        }
        sc.close();
    }
    
}
