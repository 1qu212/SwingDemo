package pane;

import javax.swing.*;
import java.awt.*;

public class JSplitePaneDemo {
    private JSplitePaneDemo() {
        JButton jButton0 = new JButton("确定");
        JButton jButton1 = new JButton("取消");
        JButton jButton2 = new JButton("优秀");
        JButton jButton3 = new JButton("良好");
        JPanel leftJPanel = new JPanel();
        JPanel rightJPanel = new JPanel();
        leftJPanel.add(jButton0);
        leftJPanel.add(jButton1);
        rightJPanel.add(jButton2);
        rightJPanel.add(jButton3);
        JSplitPane jSplitPane = new JSplitPane();
        jSplitPane.setOneTouchExpandable(true);
        jSplitPane.setContinuousLayout(true);
        jSplitPane.setPreferredSize(new Dimension(300, 100));
        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        jSplitPane.setLeftComponent(leftJPanel);
        jSplitPane.setRightComponent(rightJPanel);
        jSplitPane.setDividerSize(3);
        jSplitPane.setDividerLocation(150);
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(jSplitPane);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    public static void main(String[] args) {
        new JSplitePaneDemo();
    }
}
