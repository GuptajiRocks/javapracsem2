package feb15;
import java.util.Scanner;
public class two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt(); // Change this to desired matrix size
        char[][] matrix = new char[n][n];
        char currentChar = 'A';

        int top = 0, bottom = n - 1, left = 0, right = n - 1, direction = 0;
        // 0: right, 1: down, 2: left, 3: up

        while (top <= bottom && left <= right) {
            switch (direction) {
                case 0: // Move right
                    for (int i = left; i <= right; i++) {
                        matrix[top][i] = currentChar++;
                    }
                    top++;
                    break;
                case 1: // Move down
                    for (int i = top; i <= bottom; i++) {
                        matrix[i][right] = currentChar++;
                    }
                    right--;
                    break;
                case 2: // Move left
                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = currentChar++;
                    }
                    bottom--;
                    break;
                case 3: // Move up
                    for (int i = bottom; i >= top; i--) {
                        matrix[i][left] = currentChar++;
                    }
                    left++;
                    break;
            }
            direction = (direction + 1) % 4;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
