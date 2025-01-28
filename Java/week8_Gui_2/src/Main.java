import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        // Create components
        JLabel celsiusLabel = new JLabel("Celsius:");
        JTextField celsiusText = new JTextField();
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        JTextField fahrenheitText = new JTextField();
        JButton convertButton = new JButton("Convert");

        // Add components to frame
        frame.add(celsiusLabel);
        frame.add(celsiusText);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitText);
        frame.add(new JLabel());  // Empty cell
        frame.add(convertButton);

        // Action listener for convert button
        convertButton.addActionListener(e -> {
            try {
                if (!celsiusText.getText().isEmpty()) {
                    double celsius = Double.parseDouble(celsiusText.getText());
                    double fahrenheit = celsius * 9 / 5 + 32;
                    fahrenheitText.setText(String.format("%.2f", fahrenheit));
                } else if (!fahrenheitText.getText().isEmpty()) {
                    double fahrenheit = Double.parseDouble(fahrenheitText.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    celsiusText.setText(String.format("%.2f", celsius));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
