package apr20;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
public class three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,double[]> map = new HashMap<String,double[]>();
        map.put("E21CSEU011", new double[] {67.5,74,66,71.5,56.5});
        map.put("E21CSEU082", new double[] {48,43,32,33.5,51.5});
        map.put("E21CSEU035", new double[] {88,84.5,90,89.5,80.5});
        map.put("E21CSEU211", new double[] {27,21.5,29,28.5,22});
        map.put("E21CSEU010", new double[] {65,61,67,33,69});
        map.put("E21CSEU067", new double[] {78,76.5,69,74,73.5});
        System.out.print("Enter enrollment number: ");
        String N = sc.next();
        if(map.containsKey(N)) {
            double[] tl = map.get(N);
            for(double j : tl) {
                if(j<35) {
                    System.out.println("Result: Fail");
                    break;
                }
                break;
            }
            System.out.print("Result: Pass");
        } else {
            System.out.println("Student record not found");
        }

    }
}
