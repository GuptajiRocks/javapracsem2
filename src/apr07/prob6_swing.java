package apr07;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class prob6 extends JFrame implements ItemListener,ActionListener {
    static JFrame f;
    static JLabel l, l1;
    static JCheckBox c1, c2;
    static JButton b1;
    public static void main(String[] args) {
        f = new JFrame("frame");

        prob6 s = new prob6();
        f.setLayout(new FlowLayout());

        c1 = new JCheckBox("checkbox 1", false);
        c2 = new JCheckBox("checkbox 2", false);

        c1.addItemListener(s);
        c2.addItemListener(s);

        l = new JLabel("checkbox1 not selected");
        l1 = new JLabel("checkbox2 not selected");

        l.setForeground(Color.red);
        l1.setForeground(Color.blue);

        b1 = new JButton();
        b1.setText("final state");
        b1.addActionListener(s);
        JPanel p = new JPanel();

        p.add(c1);
        p.add(c2);
        p.add(l);
        p.add(l1);
        p.add(b1);
        f.add(p);
        f.setSize(600, 300);
        f.show();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        // if the state of checkbox1 is changed 
        if (e.getSource() == c1) {
            if (e.getStateChange() == 1)
                l.setText("checkbox 1  selected");
            else
                l.setText("checkbox 1 not selected");
        }

        // if the state of checkbox2 is changed 
        else {
            if (e.getStateChange() == 1)
                l1.setText("checkbox 2  selected");
            else
                l1.setText("checkbox 2 not selected");
        }
    }

    public void actionPerformed(ActionEvent event) {
        l.setText(c1.getLabel()+"-"+c1.isSelected());
        l1.setText(c2.getLabel()+"-"+c2.isSelected());
    }
} 