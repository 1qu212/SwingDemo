package jList;

import javax.swing.*;
import java.awt.*;

public class ListModelDemo {
    private ListModelDemo() {
        JFrame jFrame = new JFrame();
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("显示器");
        listModel.addElement("主板");
        listModel.addElement("硬盘");
        listModel.addElement("内存");
        listModel.addElement("键盘");
        listModel.addElement("鼠标");
        listModel.addElement("电源");
        listModel.addElement("光驱");
        JList jList = new JList(listModel);
        jList.setVisibleRowCount(5);
        jList.setBorder(BorderFactory.createTitledBorder("电脑配件"));
        JPanel jPanel = new JPanel();
        jPanel.add(new JScrollPane(jList));
        jPanel.setLayout(new GridLayout(1, 1));
        jFrame.setContentPane(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ListModelDemo();
    }
}
