package jList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo {
    private MouseAdapterDemo() {
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
        DefaultListModel listModel1 = new DefaultListModel();
        JList jList1 = new JList(listModel1);
        jPanel.add(new JScrollPane(jList1));
        jPanel.setLayout(new GridLayout(1, 2));
        jFrame.setContentPane(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = jList.locationToIndex(e.getPoint());
                    String tmp = (String) listModel.elementAt(index);
                    listModel1.addElement(tmp);
                    jList1.setModel(listModel1);
                    listModel.removeElementAt(index);
                    jList.setModel(listModel);
                }
            }
        });
        jList1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = jList1.locationToIndex(e.getPoint());
                    String tmp = (String) listModel1.elementAt(index);
                    listModel.addElement(tmp);
                    jList.setModel(listModel);
                    listModel1.removeElementAt(index);
                    jList1.setModel(listModel1);
                }
            }
        });
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
