package apr07;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class prob3 extends JFrame {
    JFrame f;
    JLabel l,l2,l3;
    JButton b;
    JTextField x,y;
    prob3() {
        f = new JFrame("text input chk");
        l = new JLabel();
        l.setText("x");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6,1));
        p.add(l);

        x = new JTextField();
        p.add(x);

        l2 = new JLabel();
        l2.setText("y");
        p.add(l2);

        y = new JTextField();
        p.add(y);

        b = new JButton();
        b.setText("add");
        b.addActionListener(new ButtonListener());
        p.add(b);

        l3 = new JLabel();
        l3.setText("SUM-None");
        p.add(l3);

        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setVerticalAlignment(JLabel.CENTER);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setVerticalAlignment(JLabel.CENTER);


        b.setHorizontalAlignment(JButton.CENTER);
        b.setVerticalAlignment(JButton.CENTER);


        x.setHorizontalAlignment(JTextField.CENTER);
        y.setHorizontalAlignment(JTextField.CENTER);


        f.add(p);
        f.setSize(500, 500);
        f.pack();

        f.show();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // main class
    public static void main(String[] args) {
        new prob3();
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int x_new = Integer.parseInt(x.getText());
            int y_new = Integer.parseInt(y.getText());
            l3.setText("SUM-"+(x_new+y_new));
        }
    }
}
