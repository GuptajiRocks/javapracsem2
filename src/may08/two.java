package may08;
import java.util.Scanner;

class details{
    void printDetails(String name) {
        System.out.println("Name is "+name);
    }
    void printMoney(int mon) {
        System.out.println("Money is"+mon);
    }
}
class funny{
    void joke() {
        System.out.println("Level of humour is negative");
    }
}
class twoone extends details{
    void getName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printDetails(name);
    }

}
public class two {
    public static void main(String[] args) {
        twoone t1 = new twoone();
        t1.getName();        
    }
    
}
