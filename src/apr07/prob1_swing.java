package apr07;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class prob1 extends JFrame {
    static JFrame f;
    static JLabel l;
    prob1() {
    }

    public static void main(String[] args) {
        f = new JFrame("label chk");
        l = new JLabel();
        l.setText("label text");
        JPanel p = new JPanel();
        p.add(l);

        /*JLabel l1 = new JLabel();
        l1.setText("label text1");
        JLabel l2 = new JLabel();
        l2.setText("label text2");
        p.add(l1);
        p.add(l2);*/

        p.setLayout(new BorderLayout());
        JLabel l1 = new JLabel();
        l1.setText("label text1");
        JLabel l2 = new JLabel();
        l2.setText("label text2");
        p.add(l1,BorderLayout.SOUTH);
        p.add(l2,BorderLayout.CENTER);
        p.add(l,BorderLayout.EAST);

        f.add(p);
        f.setSize(500, 500);

        f.show();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
