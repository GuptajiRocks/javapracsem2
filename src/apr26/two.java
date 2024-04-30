package apr26;
import java.util.Arrays;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cells look like macrophages");
        //Erdheim  chester
        int a = 52;
        int b = 32;
        int[] arr = new int[4];
        for(int i : arr) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
    
}
