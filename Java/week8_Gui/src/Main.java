import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //  Creates frame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));

        //  Create components
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("Password");
        JPasswordField passText = new JPasswordField();
        JButton loginButton = new JButton("Login");

        //  Add components to frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(new JLabel());    // Empty cell
        frame.add(loginButton);

        // Action listener for login button
        loginButton.addActionListener(new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e){
                String username = userText.getText();
                String password = new String(passText.getPassword());
                if (username.equals("admin")&& password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login successful");
                }else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });
        //  Set frame visibility
        frame.setVisible(true);
    }
}