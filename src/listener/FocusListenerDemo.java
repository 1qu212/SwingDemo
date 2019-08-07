package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusListenerDemo {
    private FocusListenerDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 200);
        //awt下的List会乱码
        JList list = new JList();
        list.setModel(new DefaultListModel());
        jFrame.add(list, BorderLayout.NORTH);
        JTextField jTextField = new JTextField("");
        jFrame.add(jTextField, BorderLayout.CENTER);
        jFrame.add(new JButton("确认"), BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (focusEvent.isTemporary()) {
                    ((DefaultListModel) list.getModel()).addElement("暂时性获得");
                } else {
                    ((DefaultListModel) list.getModel()).addElement("长久性获得");
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                if (focusEvent.isTemporary()) {
                    ((DefaultListModel) list.getModel()).addElement("暂时性失去");
                } else {
                    ((DefaultListModel) list.getModel()).addElement("长久性失去");
                }
            }
        });
    }

    public static void main(String[] args) {
        new FocusListenerDemo();
    }
}
