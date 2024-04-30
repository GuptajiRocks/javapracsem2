package mar19;
import java.util.Scanner;
class seven{
    seven(){
    }
    seven(int n1, int n2) {
        System.out.println(n1+n2);
    }
}

class eight extends seven{
    eight(int n1, int n2) {
        super(n1,n2);
        System.out.println(n1-n2);
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        eight s1 = new eight(a,b);
    }

}
