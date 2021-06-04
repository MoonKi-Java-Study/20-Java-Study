package act11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyChanger extends JFrame {
    private JLabel Money = new JLabel("금액      ");
    private JLabel [] Won = new JLabel[8];
    private String [] name = {"오만원    ","만원    ","천원    ","500원    ","100원    ","50원    ","10원    ","1원    "};
    private int [] divideMoney = {50000,10000,1000,500,100,50,10,1};

    private JTextField InputMoney = new JTextField(15);
    private JTextField [] OutputMoney = new JTextField[8];
    private JButton Cal = new JButton("계산");

    public MoneyChanger(){
        setTitle("MoneyChanger");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());

        jp1.add(Money);
        jp1.add(InputMoney);

        Cal.addActionListener(new MyCalListener());
        jp1.add(Cal);


        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(8, 3));

        for(int i=0;i<Won.length;i++){
            Won[i] = new JLabel(name[i],JLabel.RIGHT);
            jp2.add(Won[i]);
            OutputMoney[i] = new JTextField(15);
            jp2.add(OutputMoney[i]);
            jp2.add(new JLabel());  // 모양을 맞춰주기 위해 빈 레이블 추가
        }

        c.add(jp1);
        c.add(jp2);

        setSize(400,320);
        setVisible(true);
    }

    public void DivideWon(int won){
        int money = 0;
        int [] dm = {50000,10000,1000,500,100,50,10,1};
        for(int i=0;i<dm.length;i++){
            money = won / dm[i];
            OutputMoney[i].setText(String.valueOf(money));
            money = won % dm[i];
            won = money;
        }
    }

    class MyCalListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            DivideWon(Integer.parseInt(InputMoney.getText()));
        }
    }

    public static void main(String[] args) {
        new MoneyChanger();
    }
}