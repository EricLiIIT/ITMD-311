import javax.swing.JOptionPane;

public class guiTest {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your first name "); // Will always be string
        String allstring = "Hello " + name + "\n";

        JOptionPane.showMessageDialog(null, allstring, "Display Message",
            JOptionPane.INFORMATION_MESSAGE);
    }
}