package Exam10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx extends JFrame {
    private JLabel [] keyMessage;

    public KeyListenerEx(){
        setTitle("keyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new MyKeyListener());

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel(" getKeyCode() ");
        keyMessage[1] = new JLabel(" getKeyChar() ");
        keyMessage[2] = new JLabel(" getKeyText() ");

        for(int i=0;i<keyMessage.length;i++){
            c.add(keyMessage[i]);
            keyMessage[i].setOpaque(true); // 컴포넌트 불투명 설정
            keyMessage[i].setBackground(Color.YELLOW);
        }

        setSize(300,150);
        setVisible(true);

        c.setFocusable(true); // 컴포넌트가 포커스를 받을 수 있도록 설정
        c.requestFocus();  // 컴포넌트 강제 지정
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(e.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
