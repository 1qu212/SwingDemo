package layoutManager;

import javax.swing.*;

public class GroupLayoutDemo {
    private GroupLayoutDemo() {
        JFrame jFrame = new JFrame();
        GroupLayout groupLayout = new GroupLayout(jFrame.getContentPane());
        JButton jButton1 = new JButton("按钮1");
        JButton jButton2 = new JButton("按钮2");
        JTextField jTextField = new JTextField("文本");
        //groupLayout必须setHorizontalGroup和setVerticalGroup
        //在横向上按钮是次序的
        GroupLayout.SequentialGroup hsg = groupLayout.createSequentialGroup();
        hsg.addComponent(jButton1);
        hsg.addComponent(jButton2);
        GroupLayout.ParallelGroup hpg = groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER);
        hpg.addComponent(jTextField).addGroup(hsg);
        groupLayout.setHorizontalGroup(hpg);
        //在纵向上按钮是平行的
        GroupLayout.ParallelGroup vpg = groupLayout.createParallelGroup();
        vpg.addComponent(jButton1);
        vpg.addComponent(jButton2);
        GroupLayout.SequentialGroup vsg = groupLayout.createSequentialGroup();
        vsg.addComponent(jTextField).addGroup(vpg);
        groupLayout.setVerticalGroup(vsg);
//        //在横向上按钮是次序的
//        GroupLayout.SequentialGroup hsg = groupLayout.createSequentialGroup();
//        hsg.addComponent(jButton1);
//        hsg.addComponent(jButton2);
//        groupLayout.setHorizontalGroup(hsg);
//        //在纵向上按钮是平行的
//        GroupLayout.ParallelGroup vpg = groupLayout.createParallelGroup();
//        vpg.addComponent(jButton1);
//        vpg.addComponent(jButton2);
//        groupLayout.setVerticalGroup(vpg);
        jFrame.setLayout(groupLayout);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    public static void main(String[] args) {
        GroupLayoutDemo groupLayoutDemo = new GroupLayoutDemo();
    }
}
