import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        usersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               UserControl user=new UserControl(1);
               frame.setVisible(false);
            }
        });
    }
    public static void main(String[] args) {
        AdminDashboard admin= new AdminDashboard();
    }
}
