package may0901;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class four {
    public static void c1() {
        JFrame j = new JFrame();
        JPanel p = new JPanel();
        JLabel l1 = new JLabel();
        l1.setText("Number 1");
        p.add(l1);
        JTextField f1 = new JTextField(20);
        p.add(f1);
        JLabel l2 = new JLabel();
        l2.setText("Number 2");
        p.add(l2);
        JTextField f2 = new JTextField(20);
        p.add(f2);

        JLabel l3 = new JLabel();
        p.add(l3);

        JButton jb = new JButton("CALCULATE");
        jb.addActionListener(actionEvent -> {
            int x = Integer.parseInt(f1.getText());
            int y = Integer.parseInt(f2.getText());
            l3.setText("Sum is "+(x+y));
        });
        p.add(jb);        
        j.add(p);
        j.setSize(500,500);
        j.pack();
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        c1();
        
    }
   
    
}
