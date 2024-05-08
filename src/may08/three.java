package may08;
interface threeone{
    void cool1();
    void cool2();
}
interface threetwo{
    void video1();
    void video2();
}
class threetest implements threeone,threetwo{
    public void cool1() {
        System.out.println("This is cool1");
    }
    public void cool2() {
        System.out.println("This is cool2");
    }
    public void video1() {
        System.out.println("This is video1");
    }
    public void video2() {
        System.out.println("This is video2");
    }
}
public class three {
    public static void main(String[] args) {
        threetest t2 = new threetest();
        t2.cool1();

    }
    
}
