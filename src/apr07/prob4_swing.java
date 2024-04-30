package apr07;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

class prob4 extends JFrame implements ItemListener{
    static JFrame f;
    static JLabel l, l1, l3, l4;
    static JComboBox c1, c2;
    
    public static void main(String[] args) {
        f = new JFrame("frame");

        prob4 s = new prob4();

        String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };
        String s2[] = { "male", "female", "others" };

        c1 = new JComboBox(s1);
        c2 = new JComboBox(s2);

        c1.setSelectedIndex(3);
        c2.setSelectedIndex(0);

        c1.addItemListener(s);
        c2.addItemListener(s);

        c1.setEditable(true);

        l = new JLabel("select your city ");
        l1 = new JLabel("Jalpaiguri selected");
        l3 = new JLabel("select your gender ");
        l4 = new JLabel("Male selected");

        l.setForeground(Color.red);
        l1.setForeground(Color.blue);
        l3.setForeground(Color.red);
        l4.setForeground(Color.blue);

        JPanel p = new JPanel();

        p.add(l);
        p.add(c1);
        p.add(l1);
        p.add(l3);
        p.add(c2);
        p.add(l4);

        p.setLayout(new FlowLayout());
        f.add(p);
        f.setSize(400, 400);
        f.show();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);


        //c1.addItem("currc1");
    }

    public void itemStateChanged(ItemEvent e) {
        // if the state combobox 1 is changed
        if (e.getSource() == c1) {
            l1.setText(c1.getSelectedItem() + " selected");
            c1.addItem("currc1");
        }
        // if state of combobox 2 is changed
        else {
            l4.setText(c2.getSelectedItem() + " selected");
        }
    }
}
