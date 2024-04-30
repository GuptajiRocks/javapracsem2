package apr08;
class oneA{
    int i = 10;
    void print_Hii() {
        System.out.println("Base Class");
    }
}
class oneB extends oneA{
    int i = 21;
    void print_Hii() {
        System.out.println("Derived Class");
    }

}
public class one {
    public static void main(String[] args) {
        oneB A = new oneB();
        A.print_Hii();
        System.out.println(A.i);
    }
}
