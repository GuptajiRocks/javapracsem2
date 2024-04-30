package feb1202;
import java.util.Scanner;
class billo {

    public billo(int x, int y){
        System.out.println(x+y);
    }

    public billo() {
        System.out.println("Bye");
    }

    void get_name(){
        System.out.println("Arihant");
    }
}

class billone extends billo{

}

public class one{

    public static void main(String[] args) {
        billone sx = new billone();
        billo s2 = new billo(5,4);
        //billone s2 = new billone();
        sx.get_name();
    }
}
