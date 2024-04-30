package feb09;
import java.util.Scanner;
public class students {
    Scanner sc = new Scanner(System.in);
    int rollNo,totMa;
    String stuname;
    int factid;
    private int[] arr1 = new int[2];
    students(int roll, String name, int fid) {
        this.rollNo = roll;
        this.stuname = name;
        this.factid = fid;
        for(int i = 0;i<2;i++) {
            System.out.print("Enter marks of "+stuname+" for subject "+(i+1));
            arr1[i] = sc.nextInt();
        }
    }

    void get_rollNo() {
        System.out.println(rollNo);
    }

    String get_stuname() {
        return stuname;
    }

    int get_totm() {
        for(int j = 0; j< arr1.length;j++) {
            totMa = totMa + arr1[j];
        }
        return totMa;
    }

}
