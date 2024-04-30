package apr21;

import java.util.Scanner;
//Array creation of something other than primitive data type
//Constructor in classes
//this keyword
//method creation within a class
//object creation
//Scanner class, input output
//for loop
//element , id for loop
//function calling
class banking_deets {
    private String name;
    private int bankbalance;
    banking_deets(String nm, int bb) {
        this.name = nm;
        this.bankbalance = bb;
    }

    public void bbincre() {
        System.out.println(bankbalance+10000);
    }

    public void display() {
        System.out.println("Customer name: "+name+" and bank balance is: "+bankbalance);
    }
}
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users: ");
        int N = sc.nextInt();
        banking_deets[] arr1 = new banking_deets[N];
        for(int i = 0; i<N; i++) {
            System.out.print("Enter name: ");
            String nm = sc.next();
            System.out.print("Enter bank balance: ");
            int bb = sc.nextInt();
            arr1[i] = new banking_deets(nm,bb);
        }

        for( banking_deets i : arr1) {
            i.bbincre();
            i.display();
        }

    }
}
