package apr22;

public class one {
    public static long calcfac(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*calcfac(n-1);
        }
    }

    public static void main(String[] args) {
        long x = calcfac(5);
        System.out.println(x);
    }
}
