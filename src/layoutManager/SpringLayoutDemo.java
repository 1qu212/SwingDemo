package layoutManager;

import javax.swing.*;

public class SpringLayoutDemo {
    private SpringLayoutDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 200);
        JLabel jLabel = new JLabel("SpringLayout");
        JButton jButton1 = new JButton("按钮1");
        JButton jButton2 = new JButton("按钮2");
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        SpringLayout springLayout = new SpringLayout();
        jPanel.setLayout(springLayout);
        springLayout.putConstraint(SpringLayout.NORTH, jLabel, 5, SpringLayout.NORTH, jPanel);
        springLayout.putConstraint(SpringLayout.WEST, jLabel, (300 - jLabel.getPreferredSize().width) / 2, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, jButton1, 55, SpringLayout.NORTH, jPanel);
        springLayout.putConstraint(SpringLayout.WEST, jButton1, 5, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.EAST, jButton1, -5, SpringLayout.EAST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, jButton2, 105, SpringLayout.NORTH, jPanel);
        springLayout.putConstraint(SpringLayout.WEST, jButton2, 5, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.EAST, jButton2, -5, SpringLayout.EAST, jPanel);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SpringLayoutDemo springLayoutDemo = new SpringLayoutDemo();
    }
}
