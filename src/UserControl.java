import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserControl {
    private JPanel mainPanel;
    private JButton addNewButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JButton backButton;

    public UserControl(int userID){
        JFrame frame=new JFrame("User Control");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.setVisible(true);
        backButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdminDashboard admin= new AdminDashboard();
                frame.setVisible(false);
            }
        });
    }
}
