package apr29;

import java.util.ArrayList;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upto = sc.nextInt();
        ArrayList<Integer> finar = new ArrayList<Integer>();
        for(int i = 1; i<upto; i++) {
            ArrayList<Integer> temp1 = new ArrayList<>();
            for(int j = 1; j<i; j++) {
                if(i%j == 0) {
                    temp1.add(j);
                }
            }
            int sum = 0;
            for(int k = 0; k<temp1.toArray().length; k++) {
                sum = sum + temp1.get(k);
            }
            if(sum == i) {
                finar.add(i);
            } else {
                continue;
            }
        }
        System.out.println(finar);
    }
}
