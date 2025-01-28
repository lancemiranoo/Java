import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Creates the frame
        JFrame frame = new JFrame("Country");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Using absolute positioning

        // Create radio buttons
        JRadioButton r1 = new JRadioButton("English");
        JRadioButton r2 = new JRadioButton("French");
        JRadioButton r3 = new JRadioButton("Chinese");
        JRadioButton r4 = new JRadioButton("German");
        JRadioButton r5 = new JRadioButton("Arabic");

        // Set the first radio button as selected by default
        r1.setSelected(true);

        // Position the radio buttons
        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 100, 100, 30);
        r3.setBounds(75, 150, 100, 30);
        r4.setBounds(75, 200, 100, 30);
        r5.setBounds(75, 250, 100, 30);

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);

        // Create the button
        JButton b = new JButton("Click");
        b.setBounds(75, 300, 100, 30);

        // Add ActionListener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if a radio button is selected

                    // Proceed with the logic based on the selected radio button
                    if (r1.isSelected()) {
                        JOptionPane.showMessageDialog(frame, "Are you from U.S or U.K?");
                    } else if (r2.isSelected()) {
                        JOptionPane.showMessageDialog(frame, "Are you from France?");
                    } else if (r3.isSelected()) {
                        JOptionPane.showMessageDialog(frame, "Are you from China?");
                    } else if (r4.isSelected()) {
                        JOptionPane.showMessageDialog(frame, "Are you from Germany?");
                    } else if (r5.isSelected()) {
                        JOptionPane.showMessageDialog(frame, "Are you from Saudi Arabia?");
                    }
                }
        });

        // Add components to the frame
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(r4);
        frame.add(r5);
        frame.add(b);

        // Set frame visibility and size
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
