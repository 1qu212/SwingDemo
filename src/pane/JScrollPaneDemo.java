package pane;

import javax.swing.*;

public class JScrollPaneDemo {
    private JScrollPaneDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 150);
        JTextArea jTextArea = new JTextArea("我们是某某某软件开发公司的骨干人员，我们会竭诚为您服务！！！");
        JScrollPane jScrollPane = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jFrame.add(jScrollPane);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JScrollPaneDemo jScrollPaneDemo = new JScrollPaneDemo();
    }
}
