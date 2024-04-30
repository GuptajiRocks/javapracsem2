package feb26;
import java.util.Scanner;
import java.lang.Math.*;
class trytwo {
    int n1;
    String name;
    trytwo(int r, String n) {
        this.n1 = r;
        this.name = n;
    }

    void print_name_and_roll() {
        System.out.println("Name is "+name+" and Roll No: "+n1);
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creation of scanner object
        int r = sc.nextInt();
        //sc.nextLine();
        String n = sc.nextLine();
        trytwo s1 = new trytwo(r,n);
        s1.print_name_and_roll();
    }
}
