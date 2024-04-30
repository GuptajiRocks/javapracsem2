package mar20;
interface I{
    class juicy implements I{
        public void methodI(int i ) {
            System.out.println(i);
        }
    }
    void methodI(int i);
}
public class four {
    public static void main(String[] args) {
        I c = (I)new four();
    }
}
