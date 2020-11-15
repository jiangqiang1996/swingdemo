package xin.jiangqiang.gui.testswing;

import javax.swing.*;

/**
 * @author jiangqiang
 * @date 2020/11/13 15:36
 */
public class TestGUI1 {
    public static void main(String[] args) {
        // 主窗体
        JFrame jFrame = new JFrame("LoL");

        // 主窗体设置大小
        jFrame.setSize(400, 300);

        // 主窗体设置位置
        jFrame.setLocation(200, 200);

        // 主窗体中的组件设置为绝对定位
        jFrame.setLayout(null);

        // 按钮组件
        JButton b = new JButton("按钮");

        // 同时设置组件的大小和位置
        b.setBounds(50, 50, 280, 30);

        // 把按钮加入到主窗体中
        jFrame.add(b);

        // 关闭窗体的时候，退出程序
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 让窗体变得可见
        jFrame.setVisible(true);
    }
}