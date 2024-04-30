package mar18;
import java.util.Scanner;
class superseven{
    public void get_name() {
        System.out.println("Hello");
    }
}
class seven extends superseven{
    public void get_name() {
        System.out.println("Why Bhanshu?");

    }
}
public class three {
    public static void main(String[] args) {
        seven s1 = new seven();
        superseven s2 = new superseven();
        s1.get_name();
        s2.get_name();
    }

}
