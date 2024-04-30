package mar20;
abstract class juhu{
    void absjuhu() {
        System.out.println("Bye");
    }
}
public class two extends juhu{
    public static void main(String[] args) {
        two s1 = new two();
        s1.absjuhu();
    }

}
