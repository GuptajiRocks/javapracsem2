package apr27;
import java.util.Scanner;
class ques{
    protected String name;
    private int score;
    ques(String name) {
        this.name = name;
    }
    void disp() {
        System.out.println(score);
    }

}
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * This is program used in coderpad.io interviews
         */
        ques c1 = new ques("Arihant");
        System.out.println(c1.name);
        c1.disp();
        sc.close();

    }
    
}
