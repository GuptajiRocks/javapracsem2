package feb27;

import java.util.Scanner;
public class Series{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms of series : ");
        int N = sc.nextInt();
        double sum = 0;
        for(int i = 1; i<N+1; i++) {
            sum = sum + ((double) 1 /i);
        }
        System.out.println("sum: "+sum);
    }
}