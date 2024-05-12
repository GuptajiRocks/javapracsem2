package may12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] arr1 = s1.split(" ");
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(arr1));
        LinkedHashSet<String> l1 = new LinkedHashSet<>(a1);
        ArrayList<String> a2 = new ArrayList<>(l1);
        Object[] arr2 = a2.toArray();
        Arrays.sort(arr2);
        for(int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
        sc.close();
        

    }
}