package feb03;
import java.util.Scanner;
class vov {
    String s;
    vov(String s) {
        this.s=s;
    }
    void cvc() {
        int count = 0;
        for(int i =0;i<s.length();i++) {
            char x = s.charAt(i);
            switch(x) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }

        }
        System.out.println(count);
    }
}
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        vov n = new vov(s);
        n.cvc();

    }
}
