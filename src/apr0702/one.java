package apr0702;
import java.util.Scanner;
public class one {
    public static void exp6calc() {
        Scanner sc = new Scanner(System.in);
        int[] t1 = new int[11];
        int[] t2 = new int[11];
        double[] meantheta = new double[11];
        double[] tant = new double[11];
        for(int i = 0; i<11; i++) {
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            double restemp = (m1+m2)/2;
            System.out.println("Mean theta value is => "+restemp);
            meantheta[i] = restemp;
            double tantemp = Math.tan(Math.toRadians(restemp));
            System.out.println(tantemp);
            tant[i] = tantemp;
            sc.close();
        }
    }
    public static void calcmf() {
        Scanner sc = new Scanner(System.in);
        int n = 50;
        double i = 0.2;
        double a = 0.08;
        double mu = 0.000001256;
        for(int j = 0; j<11; j++) {
            int x = sc.nextInt();
            double denom = 2*(Math.pow(((Math.pow(x,2))+(Math.pow(a,2))),1.5));
            double numer = mu*n*i*(Math.pow(a,2));
            double finres = numer/denom;
            System.out.println(finres);
        }

    }

    public static void main(String[] args) {
        calcmf();

    }
}
