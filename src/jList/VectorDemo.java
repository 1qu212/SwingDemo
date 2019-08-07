package jList;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class VectorDemo {
    private VectorDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 400);
        Vector vector = new Vector();
        vector.add("新加坡");
        vector.add("泰国");
        vector.add("日本");
        vector.add("韩国");
        vector.add("越南");
        vector.add("美国");
        vector.add("澳大利亚");
        vector.add("法国");
        vector.add("俄罗斯");
        JList jList = new JList(vector);
        jList.setBorder(BorderFactory.createTitledBorder("你想去哪个国家旅游？"));
        JPanel jPanel = new JPanel();
        jPanel.add(jList);
        jPanel.setLayout(new GridLayout(1, 1));
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new VectorDemo();
    }
}
