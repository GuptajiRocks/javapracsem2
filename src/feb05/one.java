package feb05;
import java.util.Scanner;
class datastor {
    int n1,n2;
    datastor(int no1, int no2) {
        this.n1 = no1;
        this.n2 = no2;
    }
    datastor() {
        System.out.println("Billo");
    }
    void prin() {
        System.out.println(n1+n2);
    }
}
public class one {
    public static void trys1(int no1, int no2) {
        datastor s1 = new datastor(no1,no2);
        s1.prin();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        trys1(no1,no2);
        datastor s2 = new datastor();
    }
}
