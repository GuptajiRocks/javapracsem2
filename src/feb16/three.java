package feb16;
import java.util.Arrays;
import java.util.Scanner;
class mmm {
    int[] fina;
    mmm(int[] a) {
        this.fina = a;
    }

    int get_mean() {
        int res = 0;
        for(int i = 0; i<fina.length; i++) {
            res = res + fina[i];
        }
        int avg = res/fina.length;

        return avg;
    }

    int get_median() {
        int med1;
        Arrays.sort(fina);
        if(fina.length % 2 == 0) {
            med1 = (fina[fina.length/2] + fina[(fina.length+1)/2])/2;
        } else {
            med1 = fina[(fina.length+1)/2];
        }
        return med1;
    }

    void sort_array() {
        Arrays.sort(fina);
        System.out.println(Arrays.toString(fina));
    }
}
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int lena = sc.nextInt();
        int[] lla = new int[lena];
        for(int i = 0; i<lena; i++) {
            lla[i] = sc.nextInt();
        }
        mmm s1 = new mmm(lla);
        //int resme1 = s1.get_mean();
        int resmed1 = s1.get_median();
        s1.sort_array();

        System.out.println(resmed1);
    }
}
