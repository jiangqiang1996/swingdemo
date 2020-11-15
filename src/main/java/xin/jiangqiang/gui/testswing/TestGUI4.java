package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;
import java.util.Random;

/**
 * @author jiangqiang
 * @date 2020/11/13 16:48
 */
public class TestGUI4 {
    public static void main(String[] args) {

        final JFrame jFrame = new JFrame("LoL");
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);

        final JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png")));
        label.setIcon(icon);
        label.setBounds(375, 275, icon.getIconWidth(),icon.getIconHeight());

        jFrame.add(label);

        label.addMouseListener(new MouseListener() {

            // 释放鼠标
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 按下鼠标
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 鼠标退出
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            // 鼠标进入
            public void mouseEntered(MouseEvent e) {

                Random r = new Random();

                int x = r.nextInt(jFrame.getWidth() - label.getWidth());
                int y = r.nextInt(jFrame.getHeight() - label.getHeight());

                label.setLocation(x, y);

            }

            // 按下释放组合动作为点击鼠标
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}