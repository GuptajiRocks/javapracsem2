package apr20;

import java.util.HashMap;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, int[]> l2 = new HashMap<>();
        l2.put("ABC", new int[]{1, 2, 4});
        int[] s1 = l2.get("ABC");
        for(int i : s1) {
            System.out.println(i);
        }

    }
}
