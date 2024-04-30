package feb05;
import java.util.Scanner;

public class two {
    public static void c1() {
        Scanner sc = new Scanner(System.in);
        int[] arrList = new int[sc.nextInt()];
        for(int i = 0; i<arrList.length;i++) {
            arrList[i] = i;
            System.out.println(arrList[i]);
        }
    }
    public static void c2() {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[sc.nextInt()];
        for(int i = 0;i< arr1.length;i++) {
            int a = sc.nextInt();
            arr1[i] = a;
        }
        int inisum = 0;
        for(int j=0;j<arr1.length;j++) {
            inisum = inisum + arr1[j];
        }
        int avg = (inisum) / (arr1.length);
        System.out.println("Average is: "+avg);
    }
    public static void main(String[] args) {
        c2();

    }
}
