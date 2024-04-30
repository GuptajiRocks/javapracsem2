package apr01;
import java.util.Scanner;
import java.util.Stack;

public class one {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean decision = true;
        Scanner sc = new Scanner(System.in);
        while(decision) {
            System.out.println("Enter decision to push elements into stack: ");
            boolean dec = sc.nextBoolean();
            if(dec == true) {
                System.out.println("Enter value: ");
                Integer ele = sc.nextInt();
                stack.push(ele);
            } else{
                break;
            }
        }
        System.out.println("Current state of stack: "+stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
