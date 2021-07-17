import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300 x 300 making a swing frame");
        setSize(300, 300);// frame siz e 300 x 300
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
