package pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLayeredPaneDemo {
    private JLayeredPaneDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 250);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLayeredPane jLayeredPane = new JLayeredPane();
        JButton jButton = new JButton("确定");
        JButton jButton1 = new JButton("取消");
        jButton.setBounds(new Rectangle(100, 100, 100, 100));
        jButton1.setBounds(new Rectangle(50, 50, 100, 100));
        jLayeredPane.add(jButton, 200);
        jLayeredPane.add(jButton1, 300);
        jButton.setVisible(true);
        jButton1.setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jLayeredPane.setLayer(jButton, 300);
                jLayeredPane.setLayer(jButton1, 200);
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jLayeredPane.setLayer(jButton, 200);
                jLayeredPane.setLayer(jButton1, 300);
            }
        });
        jFrame.add(jLayeredPane);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JLayeredPaneDemo();
    }
}
