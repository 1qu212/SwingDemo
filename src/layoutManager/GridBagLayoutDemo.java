package layoutManager;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        GridBagLayoutDemo loginView = new GridBagLayoutDemo();
    }

    public GridBagLayoutDemo() {
        JFrame jFrame = new JFrame("信息管理系统");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 150);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel, BorderLayout.WEST);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        int x = (width - 300) / 2;
        int y = (height - 150) / 2;
        jFrame.setLocation(x, y);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.weightx = 3;
        gridBagConstraints.weighty = 4;
        JLabel title = new JLabel("布局管理器登录窗口");
        add(jPanel, title, gridBagConstraints, 0, 0, 4, 1);
        JLabel name = new JLabel("用户名");
        add(jPanel, name, gridBagConstraints, 0, 1, 1, 1);
        JTextField nameInput = new JTextField(15);
        add(jPanel, nameInput, gridBagConstraints, 2, 1, 1, 1);
        JLabel password = new JLabel("密码");
        add(jPanel, password, gridBagConstraints, 0, 2, 1, 1);
        JTextField pwdInput = new JTextField(15);
        add(jPanel, pwdInput, gridBagConstraints, 2, 2, 1, 1);
        JButton ok = new JButton("确认");
        JButton cancel = new JButton("取消");
        add(jPanel, ok, gridBagConstraints, 0, 3, 1, 1);
        add(jPanel, cancel, gridBagConstraints, 2, 3, 1, 1);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    public void add(JPanel jPanel, Component component, GridBagConstraints gridBagConstraints, int x, int y, int w, int h) {
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.gridwidth = w;
        gridBagConstraints.gridheight = h;
        jPanel.add(component, gridBagConstraints);
    }
}
