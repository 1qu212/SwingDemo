package JComboBox;

import javax.swing.*;
import java.awt.*;

public class ComboBoxModelDemo {
    private ComboBoxModelDemo() {
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("桃花");
        comboBoxModel.addElement("梅花");
        comboBoxModel.addElement("玫瑰");
        comboBoxModel.addElement("牡丹");
        comboBoxModel.addElement("月季");
        comboBoxModel.addElement("茉莉");
        JComboBox jComboBox = new JComboBox(comboBoxModel);
        jComboBox.setBorder(BorderFactory.createTitledBorder("选好哪种花了吗？"));
        container.add(jComboBox);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxModelDemo();
    }
}
