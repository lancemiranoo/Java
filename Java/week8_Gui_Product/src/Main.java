import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Tax Calculator");
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,3));

        // Create components
        JLabel priceLabel = new JLabel("Product Price");
        JTextField priceText = new JTextField();
        JLabel taxLabel = new JLabel("Provincial Tax");
        JTextField taxText = new JTextField();
        JButton totalButton = new JButton("Total");

        //  Add components to frame
        frame.add(priceLabel);
        frame.add(priceText);
        frame.add(taxLabel);
        frame.add(taxText);
        frame.add(new JLabel());
        frame.add(totalButton);

        // Action
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = Double.parseDouble(priceText.getText());
                double tax = Double.parseDouble(taxText.getText());
                double percentage = tax / 100;
                double total = (price * percentage) + price;
                JOptionPane.showMessageDialog(frame, total);
            }
        });
        // Set frame visibility
        frame.setVisible(true);
    }
}