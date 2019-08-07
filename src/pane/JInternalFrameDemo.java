package pane;

import javax.swing.*;
import java.awt.*;

public class JInternalFrameDemo {
    public JInternalFrameDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 150);
        JInternalFrame jInternalFrame = new JInternalFrame("第一个窗口", true, true, true, true);
        JLabel jLabel = new JLabel("这是第一个窗口这是第一个窗口这是第一个窗口");
        jInternalFrame.add(jLabel);
        jInternalFrame.setVisible(true);
        JInternalFrame jInternalFrame1 = new JInternalFrame();
        JLabel jLabel1 = new JLabel("这是第二个窗口");
        jInternalFrame1.add(jLabel1);
        jInternalFrame1.setVisible(true);
        JDesktopPane jDesktopPane = new JDesktopPane();
        jDesktopPane.setLayout(new FlowLayout());
        jDesktopPane.add(jInternalFrame);
        jDesktopPane.add(jInternalFrame1);
        jFrame.add(jDesktopPane);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JInternalFrameDemo();
    }
}
