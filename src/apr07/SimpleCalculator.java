package apr07;

import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener {

    private final JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEquals, buttonClear;
    private final JTextField display;
    private double firstValue = 0;
    private char operator = '+';

    public SimpleCalculator() {
        // Create a frame for the calculator
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(null); // Use null layout for manual positioning

        // Create a text field for displaying the calculations
        display = new JTextField();
        display.setBounds(10, 10, 280, 30);
        display.setEditable(false); // Make the text field non-editable by user
        frame.add(display);

        // Create buttons for numbers and operators
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");

        // Set button positions
        button7.setBounds(10, 50, 50, 50);
        button8.setBounds(70, 50, 50, 50);
        button9.setBounds(130, 50, 50, 50);
        buttonDiv.setBounds(190, 50, 50, 50);

        button4.setBounds(10, 110, 50, 50);
        button5.setBounds(70, 110, 50, 50);
        button6.setBounds(130, 110, 50, 50);
        buttonMul.setBounds(190, 110, 50, 50);

        button1.setBounds(10, 170, 50, 50);
        button2.setBounds(70, 170, 50, 50);
        button3.setBounds(130, 170, 50, 50);
        buttonSub.setBounds(190, 170, 50, 50);

        button0.setBounds(10, 230, 50, 50);
        buttonClear.setBounds(70, 230, 50, 50);
        buttonEquals.setBounds(130, 230, 110, 50);  // Wider button for equals

        // Add buttons to the frame
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonEquals);
        frame.add(buttonClear);

        // Add action listener to all buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

    }
}

