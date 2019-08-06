package layoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public CardLayoutDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        CardLayout cardLayout = new CardLayout(5, 5);
        jPanel.setLayout(cardLayout);
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.red);
        jPanel1.add(new JLabel("jPanel_1"));
        jPanel.add(jPanel1, "jPanel1");
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.green);
        jPanel2.add(new JLabel("jPanel_2"));
        jPanel.add(jPanel2, "jPanel2");
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(Color.blue);
        jPanel3.add(new JLabel("jPanel_3"));
        jPanel.add(jPanel3, "jPanel3");
        jFrame.add(jPanel);
        JPanel controlJPanel = new JPanel();
        JButton previousJButton = new JButton("< 上一步");
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton nextJButton = new JButton("下一步 >");
        controlJPanel.add(previousJButton);
        controlJPanel.add(jButton1);
        controlJPanel.add(jButton2);
        controlJPanel.add(jButton3);
        controlJPanel.add(nextJButton);
        jFrame.add(controlJPanel, BorderLayout.SOUTH);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        previousJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.previous(jPanel);
            }
        });
        nextJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.next(jPanel);
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(jPanel, "jPanel1");
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(jPanel, "jPanel2");
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(jPanel, "jPanel3");
            }
        });
    }

    public static void main(String[] args) {
        CardLayoutDemo cardLayoutDemo = new CardLayoutDemo();
    }
}
