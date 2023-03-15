import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class PalindromeChecker extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public PalindromeChecker() {
        setLayout(null);
        label = new JLabel("Enter a number:");
        label.setBounds(10, 10, 200, 30);
        add(label);
        textField = new JTextField();
        textField.setBounds(10, 40, 200, 30);
        add(textField);
        button = new JButton("Check");
        button.setBounds(10, 80, 200, 30);
        add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        palindromeChecker.setBounds(0, 0, 250, 150);
        palindromeChecker.setVisible(true);
        palindromeChecker.setResizable(false);
        palindromeChecker.setLocationRelativeTo(null);
        palindromeChecker.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            String reverse = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reverse += text.charAt(i);
            }
            if (text.equals(reverse)) {
                JOptionPane.showMessageDialog(null, "The number is a palindrome.");
            } else {
                JOptionPane.showMessageDialog(null, "The number is not a palindrome.");
            }
        }
    }
}