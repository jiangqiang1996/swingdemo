package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 17:05
 */
public class HeroTableModel extends AbstractTableModel {

    String[] columnNames = new String[]{"id", "name", "hp", "damage"};
    String[][] heros = new String[][]{{"1", "盖伦", "616", "100"},
            {"2", "提莫", "512", "102"}, {"3", "奎因", "832", "200"}};

    // 返回一共有多少行
    public int getRowCount() {
        // TODO Auto-generated method stub
        return heros.length;
    }

    // 返回一共有多少列
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }

    // 获取每一列的名称
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }

    // 单元格是否可以修改
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // 每一个单元格里的值
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        return heros[rowIndex][columnIndex];
    }

}

class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());

        //创建一个TableModel
        HeroTableModel htm = new HeroTableModel();

        //根据 TableModel来创建 Table
        JTable t = new JTable(htm);

        JScrollPane sp = new JScrollPane(t);

        //只需要修改数据后，调用updateUI()方法即可刷新界面数据
        //        htm.heros = new String[][]{{"1", "盖伦", "616", "101"},
        //                {"2", "提莫", "512", "103"}, {"3", "奎因", "832", "201"}};
        //        t.updateUI();

        f.add(sp, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}