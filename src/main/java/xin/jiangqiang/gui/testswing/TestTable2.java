package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 17:16
 */
public class TestTable2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());

        final HeroTableModel htm = new HeroTableModel();

        final JTable t = new JTable(htm);
        // 准备一个Panel上面放一个Label用于显示哪条被选中了
        JPanel p = new JPanel();
        final JLabel l = new JLabel("暂时未选中条目");
        p.add(l);

        JScrollPane sp = new JScrollPane(t);

        // 使用selection监听器来监听table的哪个条目被选中
        t.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

                    // 当选择了某一行的时候触发该事件
                    public void valueChanged(ListSelectionEvent e) {
                        // 获取哪一行被选中了
                        int row = t.getSelectedRow() + 1;
                        // 更新标签内容
                        l.setText("当前选中的是第" + row + "行");

                    }
                });

        f.add(p, BorderLayout.NORTH);
        f.add(sp, BorderLayout.CENTER);

//        //默认选择第一行
//        t.getSelectionModel().setSelectionInterval(0, 0);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}