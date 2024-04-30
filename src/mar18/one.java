package mar18;
import java.util.Scanner;
interface in1{
    final int a = 10;
    default void display() {
        System.out.println(a);
    }
}
interface in2{
    final int a = 20;
    static void displays() {
        System.out.println(a);
    }
}
public class one implements in1, in2{
    @Override
    public void display() {
        System.out.println("The bussy");
    }
    public static void main(String[] args) {
        one s1 = new one();
        s1.display();

    }
}
