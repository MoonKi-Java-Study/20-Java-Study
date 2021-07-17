package Exam10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {
    public IndepClassListener(){
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());  //Action 리스너 달기
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args){
        new IndepClassListener();
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {  //ActionEvent e : 이벤트 객체
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action")){
            b.setText("액션");
        }
        else {
            b.setText("Action");
        }
    }
}
