package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 10:13
 */
public class TestLayout3 {
    public static void main(String[] args) {

        JFrame f = new JFrame("title");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为BorderLayerout
        // 容器上的组件按照上北下南左西右东中的顺序摆放
        f.setLayout(new BorderLayout());

        // 加入到容器的时候，需要指定位置
        f.add(new JButton("上"), BorderLayout.NORTH);
        f.add(new JButton("下"), BorderLayout.SOUTH);
        f.add(new JButton("左"), BorderLayout.WEST);
        f.add(new JButton("右"), BorderLayout.EAST);
        f.add(new JButton("中"), BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}