import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        container.setLayout(new BorderLayout(30, 20));
        container.add(new JButton("Calculator"), BorderLayout.CENTER);
        container.add(new JButton("add"), BorderLayout.NORTH);
        container.add(new JButton("sub"), BorderLayout.SOUTH);
        container.add(new JButton("mul"), BorderLayout.EAST);
        container.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
