package layoutManager;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public BoxLayoutDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 200);
        Box hBox1 = Box.createHorizontalBox();
        hBox1.add(new JLabel("姓名："));
        hBox1.add(Box.createHorizontalStrut(20));
        JTextField nameJTextField = new JTextField(10);
        nameJTextField.setMaximumSize(nameJTextField.getPreferredSize());
        hBox1.add(nameJTextField);
        Box hBox2 = Box.createHorizontalBox();
        hBox2.add(new JLabel("密码："));
        hBox2.add(Box.createHorizontalStrut(20));
        JTextField pwdJTextField = new JTextField(10);
        pwdJTextField.setMaximumSize(pwdJTextField.getPreferredSize());
        hBox2.add(pwdJTextField);
        Box hBox3 = Box.createHorizontalBox();
        hBox3.add(new JButton("登录"));
        hBox3.add(Box.createHorizontalStrut(20));
        hBox3.add(new JButton("取消"));
        Box vBox = Box.createVerticalBox();
        vBox.add(hBox1);
        vBox.add(hBox2);
        vBox.add(Box.createVerticalGlue());
        vBox.add(hBox3);
        jFrame.getContentPane().add(vBox, BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        BoxLayoutDemo boxLayoutDemo = new BoxLayoutDemo();
    }
}
