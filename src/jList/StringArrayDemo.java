package jList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class StringArrayDemo {
    private StringArrayDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 400);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        String[] names = new String[]{"罗宾汉", "埃及延后", "拿破仑", "华盛顿", "斯巴达"};
        JList jList = new JList(names);
        jPanel.add(jList, BorderLayout.NORTH);
        JTextField jTextField = new JTextField();
        jPanel.add(jTextField, BorderLayout.SOUTH);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                jTextField.setText((String) jList.getSelectedValue());
            }
        });
    }

    public static void main(String[] args) {
        new StringArrayDemo();
    }
}
