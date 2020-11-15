package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * @author jiangqiang
 * @date 2020/11/15 16:25
 */
public class TestToolBar {
    public static void main(String[] args) {

        JFrame f = new JFrame("标题");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        JToolBar tb = new JToolBar();
        JButton b1 = new JButton(new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png"))));
        JButton b2 = new JButton(new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png"))));
        JButton b3 = new JButton(new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png"))));
        JButton b4 = new JButton(new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png"))));
        JButton b5 = new JButton(new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png"))));
        JButton b6 = new JButton(new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png"))));
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);

        // 给按钮设置提示信息
        b1.setToolTipText("坑爹");

        // 禁止工具栏拖动，默认情况下可以拖动工具类
        tb.setFloatable(false);

        // 把工具栏放在north的位置
        f.setLayout(new BorderLayout());
        f.add(tb, BorderLayout.NORTH);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }

}