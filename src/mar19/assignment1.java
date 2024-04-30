package mar19;
import java.util.Scanner;
interface incentive{
    default void get_incentive(int[] s1) {
        for(int i = 0; i<s1.length; i++) {


        }
    }
    default void set_incentive() {

    }
}
class faculty implements incentive{
    int basesal;
    faculty(int inpbsal) {
        this.basesal = inpbsal;
    }

}
class students implements incentive{
    int basescho;
    students(int inpbscho) {
        this.basescho = inpbscho;
    }
    
}
public class assignment1 {
    public static void main(String[] args) {
        incentive[] s1 = new incentive[5];


    }

}
