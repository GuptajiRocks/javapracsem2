package apr04;
import java.util.Scanner;
import java.util.Stack;
class twoone{
    twoone(double a) {


    }
}
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> s1 = new Stack<>();
        for(int i = 0; i<5; i++) {
            s1.add(sc.nextLine());
        }
        System.out.println(s1);
        sc.close();
    }

}
