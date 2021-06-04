package act11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExchangeRate extends JFrame {
    private String [] text = {"대한민국 원", "미국 달러", "유로", "일본 엔", "중국 위안화"};
    private double [] exchangeRate = {1, 1113.54, 1352.44, 10.13, 173.86};
    private JComboBox<String> inputCountry = new JComboBox<String>(text);
    private JComboBox<String> outputCountry = new JComboBox<String>(text);
    private JTextField inputMoney = new JTextField(13);
    private JTextField outputMoney = new JTextField(13);
    private JButton btn = new JButton("환전");
    private int index1 = 0;
    private int index2 = 0;

    public ExchangeRate() {
        setTitle("Exchange Rate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(inputMoney);

        c.add(inputCountry);

        c.add(outputMoney);

        outputCountry.addActionListener(new MySelectedActionListener());
        c.add(outputCountry);

        btn.addActionListener(new MyExchangeActionListener());
        c.add(btn);

        setSize(320,400);
        setVisible(true);
    }

    class MySelectedActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<String> Combo = (JComboBox<String>) e.getSource();
            if(Combo.equals(inputCountry)){
                index1 = Combo.getSelectedIndex();
            }
            else if(Combo.equals(outputCountry)){
                index2 = Combo.getSelectedIndex();
        }
    }

    class MyExchangeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            outputMoney = inputMoney.setText() * exchangeRate[index1]/exchangeRate[index2];

            }
        }
    }

    public static void main(String[] args) {
        new ExchangeRate();
    }
}
