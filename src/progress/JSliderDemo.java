package progress;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderDemo {
    private JSliderDemo() {
        JFrame jFrame = new JFrame("滑块的使用");
        jFrame.setSize(300, 200);
        Container container = jFrame.getContentPane();
        JSlider jSlider = new JSlider(0, 100, 0);
        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(5);
        jSlider.setPaintTicks(true);//刻度
        jSlider.setSnapToTicks(true);//整刻度滑动
        jSlider.setPaintLabels(true);//刻度文字
        container.add(jSlider, BorderLayout.NORTH);
        JLabel jLabel = new JLabel();
        jLabel.setText("目前刻度：" + jSlider.getValue());
        container.add(jLabel, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                jLabel.setText("目前刻度：" + jSlider.getValue());
            }
        });
    }

    public static void main(String[] args) {
        new JSliderDemo();
    }
}
