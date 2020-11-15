package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 10:17
 */
public class TestLayout4 {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为GridLayerout，即网格布局器
        // 该GridLayerout的构造方法表示该网格是2行3列
        f.setLayout(new GridLayout(2, 3));

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }

}
