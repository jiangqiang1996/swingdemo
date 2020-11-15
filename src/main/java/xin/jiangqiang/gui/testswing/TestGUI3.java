package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

/**
 * @author jiangqiang
 * @date 2020/11/13 16:35
 */
public class TestGUI3 {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("LoL");
        jFrame.setSize(400, 300);
        jFrame.setLocation(580, 200);
        jFrame.setLayout(null);

        final JLabel label = new JLabel();

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png")));
        label.setIcon(icon);
        label.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());

        // 增加键盘监听
        jFrame.addKeyListener(new KeyListener() {

            // 键被弹起
            public void keyReleased(KeyEvent e) {

                // 39代表按下了 “右方向键”
                if (e.getKeyCode() == 39) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    label.setLocation(label.getX() + 10, label.getY());
                }
            }

            //键被按下
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {

            }
        });

        jFrame.add(label);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}
