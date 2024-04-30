package mar19;
import java.util.Scanner;
interface incentives{
    default void get_incentives() {

    }
}
class faculties implements incentives{
    private int basesal;
    faculties(int inpbsal) {
        this.basesal = inpbsal;
    }
}
class student implements incentives {
    private int basescho;
    student(int inpbscho) {
        this.basescho = inpbscho;
    }
}
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        faculties s1 = new faculties(45000);
        student s2 = new student(25000);
        int[] incen = new int[2];
        incentives[] i1 = {s1,s2};
//        i1[0].get_incentives();
        for(int i = 0; i<incen.length;i++) {
            i1[i].get_incentives();

        }


    }
}
