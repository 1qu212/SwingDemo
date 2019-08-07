package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo {
    private ActionListenerDemo() {
        JFrame jFrame = new JFrame("动作事件测试窗口");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jButton = new JButton("确认");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ((JButton)actionEvent.getSource()).setLabel("取消");
            }
        });
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ActionListenerDemo();
    }
}
