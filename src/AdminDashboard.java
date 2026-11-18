import javax.swing.*;
import java.awt.*;

public class AdminDashboard {
    private JPanel mainPanel;
    private JButton usersButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public AdminDashboard(){
        JFrame frame= new JFrame("Admin Dashboard");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        AdminDashboard admin= new AdminDashboard();
    }
}
