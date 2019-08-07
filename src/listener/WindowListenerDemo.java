package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListenerDemo {
    private WindowListenerDemo() {
        JFrame jFrame = new JFrame("测试窗口");
        jFrame.setSize(400, 300);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JDialog jDialog = new JDialog((Frame) e.getSource(), "系统出错了", true);
                jDialog.setSize(200, 100);
                JLabel jLabel = new JLabel("你确定要关闭？");
                jDialog.add(jLabel, BorderLayout.CENTER);
                jLabel.setVisible(true);
                JButton jButton = new JButton("确定");
                JButton jButton1 = new JButton("取消");
                GridLayout gridLayout = new GridLayout(1, 2);
                JPanel jPanel = new JPanel();
                jPanel.setLayout(gridLayout);
                jPanel.add(jButton);
                jPanel.add(jButton1);
                jDialog.add(jPanel, BorderLayout.SOUTH);
                jDialog.setVisible(true);
            }
        });
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowListenerDemo();
    }
}
