package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 16:44
 */
public class TestTable {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());

        //如果不放在JScrollPane里面，就不会显示表头
        String[] columnNames = new String[]{"id", "name", "hp", "damage"};
        String[][] heros = new String[][]{{"1", "盖伦", "616", "100"},
                {"2", "提莫", "512", "102"}, {"3", "奎因", "832", "200"}};
        JTable t = new JTable(heros, columnNames);

        // 根据t创建 JScrollPane
        JScrollPane sp = new JScrollPane(t);

        //或则创建一个空的JScrollPane，再通过setViewportView把table放在JScrollPane中
        // JScrollPane sp = new JScrollPane(t);
        // sp.setViewportView(t);

        // 设置列宽度
        t.getColumnModel().getColumn(0).setPreferredWidth(10);

        // 把sp而非JTable加入到JFrame上，
        f.add(sp, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }

}
