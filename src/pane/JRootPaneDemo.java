package pane;

import javax.swing.*;

public class JRootPaneDemo {
    private JRootPaneDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300, 200);
        JRootPane jRootPane = new JRootPane();
        jFrame.add(jRootPane);
        jRootPane.getGlassPane().setVisible(true);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("文件");
        jMenu.add(new JMenuItem("打开"));
        jMenu.add(new JMenuItem("保存"));
        jMenu.add(new JSeparator());
        jMenu.add(new JMenuItem("打印"));
        jMenu.add(new JSeparator());
        jMenu.add(new JMenuItem("退出"));
        jMenuBar.add(jMenu);
        jMenuBar.add(new JMenu("编辑"));
        jMenuBar.add(new JMenu("视图"));
        jMenuBar.add(new JMenu("帮助"));
        jRootPane.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JRootPaneDemo();
    }
}
