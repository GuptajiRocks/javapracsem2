package oct18;

import java.util.*;

class sender {
    int senderID;
    String custName;
    boolean fundsAvail = false;
    double accBal;
    LinkedHashMap<String, Integer> msgTransaction = new LinkedHashMap<String, Integer>();

    sender(String nm, double inibal, int custid) {
        custName = nm;
        accBal = inibal;
        senderID = custid;
    }

    sender() {}

    boolean checkFunds(double amt) {
        if (amt < accBal) {
            fundsAvail = true;
        } else {
            fundsAvail = false;
        }
        return fundsAvail;
    }

    void addAmt(double amt) {
        if (amt < 0) {
            System.out.println("Amount Added can't be negative");
        } else {
            accBal += amt;
        }
    }

    boolean sendMoney(String mess, double amt) {
        if (!checkFunds(amt)) {
            return false;
        }
        boolean allowed = true;
        List<String> keys = new ArrayList<>(msgTransaction.keySet());
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(mess)) {
                allowed = false;
            }
        }
        if (allowed) {
            accBal = accBal - amt;
            return true;
        }
        return false;
    }
}

class receive {
    

}

public class one {
    //Building a payments infrastructure

    public static void program() {
        Scanner sc = new Scanner(System.in);
        List<sender> senderdet = new ArrayList<sender>();

        while (true) {
            System.out.println("Starting a transaction");
            

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Arihant Pay");
        System.out.println("Press 1: Enter the Program");
        int majorChoice = sc.nextInt();
        if (majorChoice == 1) {
            program();
        } else {
            System.out.println("Bye bye");
        }
    }

}
