package apr21;
import java.util.ArrayList;
import java.util.Scanner;
class juicypussy{
    public void callme() {
        System.out.println("Why?");
    }
    public static void c2() {
        System.out.println("Jai mata di");
    }
}
public class one extends juicypussy{
    public void callme() {
        System.out.println("Tere naam waala salman khan");
    }
    public static void main(String[] args) {
        one s1 = new one();
        s1.callme();
        juicypussy j1 = new juicypussy();
        j1.callme();
        //Static method
        juicypussy.c2();
    }
}
