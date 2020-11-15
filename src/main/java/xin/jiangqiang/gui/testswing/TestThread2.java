package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * @author jiangqiang
 * @date 2020/11/15 12:47
 */
public class TestThread2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png")));
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        JButton b = new JButton("隐藏图片");
        b.setBounds(150, 200, 100, 30);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                l.setVisible(false);

                System.out.println("当前使用的是事件调度线程：" + SwingUtilities.isEventDispatchThread());
            }
        });

        f.add(l);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}