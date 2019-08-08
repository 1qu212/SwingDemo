package progress;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo {

    private final Timer timer;

    private JProgressBarDemo() {
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        JButton jButton = new JButton("开始");
        JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setOrientation(SwingConstants.HORIZONTAL);
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(true);
        jProgressBar.setPreferredSize(new Dimension(200, 30));
        JLabel jLabel = new JLabel("目前已完成进度0%", SwingConstants.CENTER);
        jLabel.setPreferredSize(new Dimension(200, 30));
        container.add(jButton, BorderLayout.NORTH);
        container.add(jProgressBar, BorderLayout.CENTER);
        container.add(jLabel, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int value = jProgressBar.getValue();
                if (value < 100) {
                    value++;
                    jProgressBar.setValue(value);
                } else {
                    timer.stop();
                    jProgressBar.setValue(0);
                }
            }
        });
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                timer.start();
            }
        });
        jProgressBar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                int value = jProgressBar.getValue();
                jLabel.setText("目前已完成进度" + value + "%");
            }
        });
    }

    public static void main(String[] args) {
        new JProgressBarDemo();
    }
}
