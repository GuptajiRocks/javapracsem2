package may0901;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class three{
 JFrame f;
 JLabel l,l2;
 JButton b;
 int count;
 three() {
 f = new JFrame("button chk");
 l = new JLabel();
 l.setText("Button Count");
 JPanel p = new JPanel();
 p.add(l);
 l2 = new JLabel();
 l2.setText("Press Count -"+count);
 p.add(l2);
 b = new JButton();
 b.setText("Increment");
 b.addActionListener(new ButtonListener());
 p.add(b);
 f.add(p);
 f.setSize(500, 500);
 f.setVisible(true);;
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 // main class
 public static void main(String[] args) {
 new three();
 }
 private class ButtonListener implements ActionListener {
 public void actionPerformed(ActionEvent event) {
 count++;
 l2.setText("Press Count -"+count);
 }
 }
}