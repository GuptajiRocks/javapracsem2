package jan18;

public class one {
    public static void q1() {
        System.out.println("j"+"a"+"v"+"a");
    }
    public static void q2() {
        int $_ = 5;
    }
    public static void q3() {
        int x=2, y=5;
        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));
        System.out.println(exp1);
        System.out.println(exp2);
    }
    public static void q4() {
        double exp1 = (3.0*2/4);
        int exp2 = (3*-2%4);
        System.out.println(exp1);
        System.out.println(exp2);
    }
    public static void q5() {
        int x = 9,y=12, z=3;
        int exp1 = x-y/3+z*2-1;
        int exp2 = (x-y)/3 + ((z*2)-1);
        System.out.println(exp1);
        System.out.println(exp2);
    }
    public static void q6() {
        int x=9, y=12;
        int a=2,b=4,c=6;
        int exp = (3+4*x)/5 - 10 * (y-5) * (a+b+c)/x + 9*(4/x + (9+x)/y);
        System.out.println(exp);
        //7 - 93 + 9
    }
    public static void q7() {
        int x=9, y=12;
        int a=2,b=4,c=6;
        int exp = 4/3 * (x+34) + 9*(a+b*c) + (3+y*(2+a)) / (a+b*y);
        System.out.println(exp);
    }
    public static void q8() {
        int x=9, y=12;
        int a=2, b=4;
        boolean exp = 4/3 * (x+34) < 9 * (3+y*(2+a)) / (a+b*y);
        //1*43 < 459 / 50
        System.out.println(exp);
    }
    public static void main(String[] args) {
        q5();
    }
}
