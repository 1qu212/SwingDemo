package pane;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneDemo {
    private JTabbedPaneDemo() {
        JFrame jFrame = new JFrame();
        JTabbedPane jTabbedPane = new JTabbedPane();
        jFrame.add(jTabbedPane);
        JPanel jPanel = new JPanel();
        jTabbedPane.add("个人收入状况", jPanel);
        JPanel jPanel1 = new JPanel();
        JLabel jLabel = new JLabel("工资状况");
        JLabel jLabel1 = new JLabel("3000元/月");
        jPanel1.add(jLabel);
        jPanel1.add(jLabel1);
        jPanel1.setLayout(new FlowLayout());
        jTabbedPane.add("工资", jPanel1);
        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("奖金状况");
        JLabel jLabel3 = new JLabel("1500元/月");
        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel2.setLayout(new FlowLayout());
        jTabbedPane.add("奖金", jPanel2);
        JPanel jPanel3 = new JPanel();
        JLabel jLabel4 = new JLabel("津贴状况");
        JLabel jLabel5 = new JLabel("500元/月");
        jPanel3.add(jLabel4);
        jPanel3.add(jLabel5);
        jPanel3.setLayout(new FlowLayout());
        jTabbedPane.add("补贴", jPanel3);
        JPanel jPanel4 = new JPanel();
        JLabel jLabel6 = new JLabel("社保状况");
        JLabel jLabel7 = new JLabel("200元/月");
        jPanel4.add(jLabel6);
        jPanel4.add(jLabel7);
        jPanel4.setLayout(new FlowLayout());
        jTabbedPane.add("社保", jPanel4);
        jTabbedPane.setPreferredSize(new Dimension(300, 200));
        jTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}
