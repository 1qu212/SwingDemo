package JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListenerDemo {
    private JLabel jLabel;
    private Font font;
    private int size;

    private ListenerDemo() {
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        container.setLayout(new GridLayout(2, 1));
        jLabel = new JLabel("Swing", SwingConstants.CENTER);
        size = 12;
        font = new Font("SansSerif", Font.PLAIN, size);
        jLabel.setFont(font);
        container.add(jLabel);
        String[] fontSize = new String[]{"12", "14", "16", "18", "20", "22", "24"};
        JComboBox jComboBox = new JComboBox(fontSize);
        jComboBox.setBorder(BorderFactory.createTitledBorder("选择所需文字大小"));
        container.add(jComboBox);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);
        jFrame.setVisible(true);
        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                size = Integer.parseInt((String) itemEvent.getItem());
                font = new Font("SansSerif", Font.PLAIN, size);
                jLabel.setText("Swing 目前字体大小：" + size);
                jLabel.setFont(font);
            }
        });
    }

    public static void main(String[] args) {
        new ListenerDemo();
    }
}
