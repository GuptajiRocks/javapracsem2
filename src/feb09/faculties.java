package feb09;
import java.util.Arrays;
import java.util.Scanner;
class facult {
    int facid;
    String fname;
    facult(int fid, String nm) {
        this.facid = fid;
        this.fname = nm;
    }
}

public class faculties {
    public static void main(String[] args) {
        facult f1 = new facult(1, "SQ");
        students s1 = new students(55, "Arihant", 1);
        students s2 = new students(49, "Vishnu", 1);
        students s3 = new students(299, "Rudrakash", 1);

        students[] sall = {s1,s2,s3};
        String res;

        int[] arrf = {s1.get_totm(),s2.get_totm(),s3.get_totm()};
        int avgs = (Arrays.stream(arrf).sum())/3;
        for(int p = 0; p<arrf.length;p++) {
            if (arrf[p] > avgs) {
                res = sall[p].get_stuname();
                System.out.println(res);
            }
        }
    }

}
