import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String result;
        String result1;
        result = JOptionPane.showInputDialog("Enter Password");
        result1 = JOptionPane.showInputDialog("Confirm Password?");
        if (result.equals(result1)) {
            JOptionPane.showMessageDialog(null, "Login Successful");
        }
        else {
            JOptionPane.showMessageDialog(null, "Password does not match");
        }
    }
}
