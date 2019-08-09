package chooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserDemo {

    private Color color;

    private JColorChooserDemo() {
        color = new Color(0, 0, 0, 0);
        JFrame jFrame = new JFrame();
        Container container = jFrame.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        container.setPreferredSize(new Dimension(550, 250));
        JButton jButton = new JButton("选取颜色");
        JLabel jLabel = new JLabel("RGB:");
        JLabel jLabel1 = new JLabel("R:");
        JLabel jLabel2 = new JLabel("G:");
        JLabel jLabel3 = new JLabel("B");
        container.add(jButton);
        container.add(jLabel);
        container.add(jLabel1);
        container.add(jLabel2);
        container.add(jLabel3);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                color = JColorChooser.showDialog(container, "Choose color", color);
                if (color != null) {
                    container.setBackground(color);
                    jLabel.setText("RGB:" + color.getRGB());
                    jLabel1.setText("R:" + color.getRed());
                    jLabel2.setText("G:" + color.getGreen());
                    jLabel3.setText("B:" + color.getBlue());
                } else {
                    color = new Color(0, 0, 0, 0);
                }
            }
        });
    }

    public static void main(String[] args) {
        new JColorChooserDemo();
    }
}
