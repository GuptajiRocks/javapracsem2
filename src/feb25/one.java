package feb25;
import java.util.Scanner;
class bstudents{
    void spolicy() {
        System.out.println("Policy: 75 percent");
    }
}

class mstudents {
    void spolicy() {
        System.out.println("Policy is 85 percent");
    }
}
class fstu extends mstudents {
}
public class one {
    public static void main(String[] args) {
        fstu s1 = new fstu();
        s1.spolicy();


    }
}
