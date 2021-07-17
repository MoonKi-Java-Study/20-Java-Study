package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Money Changer");
        setSize(500, 400);
        setLocation(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        this.add(jPanel1);
        jPanel1.setLayout(new FlowLayout());
        jPanel1.setPreferredSize(new Dimension(490, 50));

        JLabel jLabel = new JLabel("금액      ");
        jPanel1.add(jLabel);
        JTextField input = new JTextField(10);
        jPanel1.add(input);
        JButton calculateMoney = new JButton("계산");
        jPanel1.add(calculateMoney);

        jPanel2.setLayout(new GridLayout(8, 1, 5, 20));
        jPanel2.setPreferredSize(new Dimension(400, 300));

        JLabel jLabel1 = new JLabel("오만원");
        jPanel2.add(jLabel1);
        JTextField output1 = new JTextField(10);
        jPanel2.add(output1);
        JLabel jLabel2 = new JLabel("만원");
        jPanel2.add(jLabel2);
        JTextField output2 = new JTextField(10);
        jPanel2.add(output2);
        JLabel jLabel3 = new JLabel("천원");
        jPanel2.add(jLabel3);
        JTextField output3 = new JTextField(10);
        jPanel2.add(output3);
        JLabel jLabel4 = new JLabel("500원");
        jPanel2.add(jLabel4);
        JTextField output4 = new JTextField(10);
        jPanel2.add(output4);
        JLabel jLabel5 = new JLabel("100원");
        jPanel2.add(jLabel5);
        JTextField output5 = new JTextField(10);
        jPanel2.add(output5);
        JLabel jLabel6 = new JLabel("50원");
        jPanel2.add(jLabel6);
        JTextField output6 = new JTextField(10);
        jPanel2.add(output6);
        JLabel jLabel7 = new JLabel("10원");
        jPanel2.add(jLabel7);
        JTextField output7 = new JTextField(10);
        jPanel2.add(output7);
        JLabel jLabel8 = new JLabel("1원");
        jPanel2.add(jLabel8);
        JTextField output8 = new JTextField(10);
        jPanel2.add(output8);

        jPanel1.add(jPanel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
