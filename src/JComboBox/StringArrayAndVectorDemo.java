package JComboBox;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class StringArrayAndVectorDemo {
    private StringArrayAndVectorDemo() {
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        String[] flowers = new String[]{"桃花", "梅花", "玫瑰", "牡丹", "月季", "茉莉", "菊花", "莲花"};
        JComboBox jComboBox = new JComboBox(flowers);
        jComboBox.addItem("映山红");
        jComboBox.setBorder(BorderFactory.createTitledBorder("你喜欢哪种花？"));
        container.add(jComboBox);
        Vector vector = new Vector();
        vector.add("桃花");
        vector.add("梅花");
        vector.add("玫瑰");
        vector.add("牡丹");
        vector.add("月季");
        vector.add("茉莉");
        JComboBox jComboBox1 = new JComboBox(vector);
        jComboBox1.setBorder(BorderFactory.createTitledBorder("你想送什么花？"));
        container.add(jComboBox1);
        container.setLayout(new GridLayout(1, 2));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setResizable(false);
        jFrame.show();
    }

    public static void main(String[] args) {
        new StringArrayAndVectorDemo();
    }
}
