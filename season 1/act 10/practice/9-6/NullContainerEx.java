import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel jLabel = new JLabel("Hello, Press Buttons!");
        jLabel.setLocation(130, 50);
        jLabel.setSize(200, 20);
        container.add(jLabel);

        for (int i = 1; i <= 9; i++) {
            JButton jButton = new JButton(Integer.toString(i));;
            jButton.setLocation(i * 15, i * 15);
            jButton.setSize(50, 20);
            container.add(jButton);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
