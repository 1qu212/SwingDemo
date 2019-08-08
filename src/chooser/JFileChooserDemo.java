package chooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class JFileChooserDemo {

    private final JFileChooser jFileChooser;
    private File file;

    private JFileChooserDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(350, 400);
        Container container = jFrame.getContentPane();
        JLabel jLabel = new JLabel("", SwingConstants.CENTER);
        jLabel.setSize(350, 30);
        container.add(jLabel, BorderLayout.NORTH);
        JTextArea jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setPreferredSize(new Dimension(350, 300));
        container.add(jScrollPane, BorderLayout.CENTER);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 2));
        JButton jButton = new JButton("打开文件");
        JButton jButton1 = new JButton("保存文件");
        jPanel.add(jButton);
        jPanel.add(jButton1);
        container.add(jPanel, BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFileChooser = new JFileChooser();
        jFileChooser.addChoosableFileFilter(new JavaFileFilter("java"));
        jFileChooser.addChoosableFileFilter(new JavaFileFilter("class"));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jFileChooser.setDialogTitle("打开文件");
                jFileChooser.setApproveButtonText("确定");
                int result = jFileChooser.showOpenDialog(jFrame);
                switch (result) {
                    default:
                        file = null;
                        jLabel.setText("您没有选择任何文件");
                        break;
                    case JFileChooser.APPROVE_OPTION:
                        file = jFileChooser.getSelectedFile();
                        jLabel.setText("您选择打开的文件名称为：" + file.getName());
                        BufferedReader br = null;
                        FileInputStream fim = null;
                        try {
                            fim = new FileInputStream(file);
                            br = new BufferedReader(new InputStreamReader(fim, "UTF-8"));
                            int readByte;
                            StringBuffer stringBuffer = new StringBuffer();
                            while ((readByte = br.read()) != -1) {
                                stringBuffer.append((char) readByte);
                            }
                            jTextArea.setText(stringBuffer.toString());
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (br != null) {
                                    br.close();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            try {
                                if (fim != null) {
                                    fim.close();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case JFileChooser.CANCEL_OPTION:
                        file = null;
                        jLabel.setText("您没有选择任何文件");
                        break;
                }
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (file != null) {
                    BufferedWriter bw = null;
                    FileOutputStream fom = null;
                    try {
                        fom = new FileOutputStream(file);
                        bw = new BufferedWriter(new OutputStreamWriter(fom, "UTF-8"));
                        bw.write(jTextArea.getText());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (bw != null) {
                                bw.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (fom != null) {
                                fom.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        file = null;
                        jLabel.setText("您没有选择任何文件");
                        jTextArea.setText("");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new JFileChooserDemo();
    }
}
