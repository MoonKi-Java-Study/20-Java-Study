package act11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExchangeRate extends JFrame {
    private String [] text = {"대한민국 원", "미국 달러", "유로", "일본 엔", "중국 위안화"};
    private double [] exchangeRate = {1, 1113.54, 1352.44, 10.13, 173.86}; //원 단위
    private JComboBox<String> inputCountry = new JComboBox<String>(text);
    private JComboBox<String> outputCountry = new JComboBox<String>(text);
    private JTextField inputMoney = new JTextField(13);
    private JTextField outputMoney = new JTextField(13);
    private JTextField result = new JTextField(25);
    private JButton btn = new JButton("환전");
    private int index1 = 0;
    private int index2 = 0;

    public ExchangeRate() {
        setTitle("Exchange Rate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JMenuBar mb = new JMenuBar();
        JMenuItem [] menuItems = new JMenuItem[2];
        String [] itemName = {"프로그램 종료", "오늘의 환전"};
        JMenu screenMenu = new JMenu("메뉴");

        MenuActionListener listener = new MenuActionListener();
        for(int i=0;i<menuItems.length;i++){
            menuItems[i] = new JMenuItem(itemName[i]);
            menuItems[i].addActionListener(listener);
            screenMenu.add(menuItems[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb);

        c.add(inputMoney);

        inputCountry.addActionListener(new MySelectedActionListener());
        c.add(inputCountry);

        c.add(outputMoney);

        outputCountry.addActionListener(new MySelectedActionListener());
        c.add(outputCountry);

        btn.addActionListener(new MyExchangeActionListener());
        c.add(btn);

        c.add(result);

        setSize(320,400);
        setVisible(true);
    }


    class MySelectedActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<String> Combo = (JComboBox<String>) e.getSource();
            if (Combo.equals(inputCountry)) {
                index1 = Combo.getSelectedIndex();
                outputCountry.removeAllItems();
                for(int i=0;i<text.length;i++) {
                    if (i != inputCountry.getSelectedIndex()) {
                        outputCountry.addItem(text[i]);
                    }
                }
            }
            else if (Combo.equals(outputCountry)) {
                String item = (String) Combo.getSelectedItem();
                for(int i=0;i<text.length;i++){
                    if(item == text[i]){
                        index2 = i;
                    }
                }
            }
        }
    }

    class MyExchangeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            double m = Double.parseDouble(inputMoney.getText()) * (exchangeRate[index1]/exchangeRate[index2]);
            outputMoney.setText(String.format("%.3f",m));
        }
    }

    class MenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) {
                case "프로그램 종료" :
                    System.exit(0);
                case "오늘의 환전" :
                    result.setText(String.format("1 (%s) -> %f (%s)", text[index1], exchangeRate[index1]/exchangeRate[index2], text[index2]));
            }
        }
    }

    public static void main(String[] args) {
        new ExchangeRate();
    }
}