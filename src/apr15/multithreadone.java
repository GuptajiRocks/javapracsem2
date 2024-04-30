package apr15;
class juicyone extends Thread{
    public void run() {
        System.out.println("Why why");
    }
}
public class multithreadone {
    public static void main(String[] args) {
        juicyone s1 = new juicyone();
        for(int i = 0; i<5; i++) {
            s1.start();
        }
    }
}
