import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);

        Container container = getContentPane();
        container.setLayout(grid);
        container.add(new JLabel(" name"));
        container.add(new JTextField(""));
        container.add(new JLabel(" number"));
        container.add(new JTextField(""));
        container.add(new JLabel(" Dept"));
        container.add(new JTextField(""));
        container.add(new JLabel(" Subject"));
        container.add(new JTextField(""));
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
