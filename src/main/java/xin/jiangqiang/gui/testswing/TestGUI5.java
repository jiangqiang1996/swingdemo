package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.Random;

/**
 * @author jiangqiang
 * @date 2020/11/13 16:57
 */
public class TestGUI5 {
    public static void main(String[] args) {

        final JFrame jFrame = new JFrame("LoL");
        jFrame.setSize(800, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);

        final JLabel label = new JLabel("");

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png")));
        label.setIcon(icon);
        label.setBounds(375, 275, icon.getIconWidth(), icon.getIconHeight());

        jFrame.add(label);

        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
        label.addMouseListener(new MouseAdapter() {

            // 只有mouseEntered用到了
            public void mouseEntered(MouseEvent e) {

                Random r = new Random();

                int x = r.nextInt(jFrame.getWidth() - label.getWidth());
                int y = r.nextInt(jFrame.getHeight() - label.getHeight());

                label.setLocation(x, y);

            }
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}