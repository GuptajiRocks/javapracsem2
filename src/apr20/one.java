package apr20;

import java.util.*;
import java.lang.*;
import java.io.*;
public class one {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String,Double> ll = new LinkedHashMap<String,Double>();
        LinkedHashMap<String, int[]> l2 = new LinkedHashMap<>();
        while(true) {
            System.out.print("Enter enrollment number: ");
            String eno = scan.next();
            if(eno.equals("done")) {
                break;
            } else {
                System.out.print("Enter Marks: ");
                double ma = scan.nextDouble();
                ll.put(eno,ma);
            }
        }
        Set<String> s1 = ll.keySet();
        System.out.println(s1);
    }
}

