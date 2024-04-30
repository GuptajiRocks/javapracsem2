package feb12;
import javax.swing.*;
import java.awt.event.*;
public class NameAgeStore{

        private static final int MAX_ENTRIES = 10; // Maximum number of entries allowed

        private JFrame frame;
        private JLabel nameLabel, ageLabel;
        private JTextField nameField, ageField;
        private JButton submitButton;
        private String[] names;
        private int[] ages;
        private int currentEntry;

        public void NameAgeStore() {
            names = new String[MAX_ENTRIES];
            ages = new int[MAX_ENTRIES];
            currentEntry = 0;

            // Create main window
            frame = new JFrame("Name and Age Storage");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Create labels and text fields
            nameLabel = new JLabel("Name:");
            nameField = new JTextField(20);
            ageLabel = new JLabel("Age:");
            ageField = new JTextField(5);

            // Create submit button
            submitButton = new JButton("Submit");
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());

                    // Check if array is full
                    if (currentEntry >= MAX_ENTRIES) {
                        JOptionPane.showMessageDialog(frame, "Maximum entries reached!");
                        return;
                    }

                    // Store name and age in arrays
                    names[currentEntry] = name;
                    ages[currentEntry] = age;
                    currentEntry++;

                    // Clear text fields
                    nameField.setText("");
                    ageField.setText("");

                    // Display confirmation message
                    JOptionPane.showMessageDialog(frame, "Name and age stored successfully!");
                }
            });

            // Add components to the frame
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(nameLabel);
            panel.add(nameField);
            panel.add(ageLabel);
            panel.add(ageField);
            panel.add(submitButton);
            frame.add(panel);

            // Display the frame
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            new NameAgeStore();
        }
    }

