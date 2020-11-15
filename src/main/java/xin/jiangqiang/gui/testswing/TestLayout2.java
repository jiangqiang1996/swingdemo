package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 10:05
 */
public class TestLayout2 {

    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为FlowLayerout
        // 容器上的组件水平摆放
        f.setLayout(new FlowLayout());

        // 加入到容器即可，无需单独指定大小和位置
        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

    }
}