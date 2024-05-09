package may0901;
import java.util.Scanner;
import java.util.ArrayList;
class likethat extends Exception {
    likethat(String msg) {
        super(msg);
    }
}
class notanumber extends Exception {
    notanumber(String msg) {
        super(msg);
    }
}
class oneone {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private int salary;
    oneone(String nm, int s) {
        this.name = nm;
        this.salary = s;
        System.out.println("Customer name is: "+name);        
    }
    public void deposit() {
        System.out.println("Enter amount to deposit: ");
        int depositamount = sc.nextInt();
        salary = salary + depositamount;
        System.out.println("New salary is: "+salary);
    }
    public void withdraw() {
        System.out.println("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        salary = salary - withdrawAmount;
        System.out.println("Amount withdrawn is: "+withdrawAmount);
        System.out.println("New amount is: "+salary);
    }
}
public class one {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<oneone> finob = new ArrayList<>();
        System.out.println("Enter number of Employees?: ");
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            System.out.println("Enter name: ");
            String nm = sc.next();
            System.out.println("Enter initial salary: ");
            int sal = sc.nextInt();
            finob.add(new oneone(nm,sal));
        }

        while(true) {
            System.out.println("Welcome to operation performing: ");
            System.out.println("Enter the number preceeding your choice ");
            System.out.println("Press 1 to deposit money");
            System.out.println("Press 2 to Withdraw money");
            System.out.println("Press 3 to exit the program");

            
            try{
                final int choice = sc.nextInt();     
                if(Integer.valueOf(choice) != choice) {
                    throw new notanumber("Not a number");
                }        
                   
                if(choice == 1) {
                    System.out.println("Enter index of employee you wish to deposit money");
                    int tempval = sc.nextInt();
                    oneone temp1 = finob.get(tempval-1);
                    temp1.deposit();
                } else if(choice == 2) {
                    System.out.println("Enter index of employee you wish to withdraw money");
                    int tempval2 = sc.nextInt();
                    oneone temp2 = finob.get(tempval2-1);
                    temp2.withdraw();
                } else if(choice >= 3) {
                    break;
                }
            } catch (notanumber n) {

            }
        }

        
        sc.close();


        
    }

}