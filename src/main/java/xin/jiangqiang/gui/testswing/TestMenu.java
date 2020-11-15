package xin.jiangqiang.gui.testswing;

import javax.swing.*;

/**
 * @author jiangqiang
 * @date 2020/11/15 16:08
 */
public class TestMenu {
    public static void main(String[] args) {

        JFrame f = new JFrame("记事本");
        f.setSize(400, 400);
        f.setLocation(200, 200);

        JMenuBar mb = new JMenuBar();

        JMenu mHero = new JMenu("文件（F）");
        JMenu mItem = new JMenu("编辑（E）");
        JMenu mWord = new JMenu("格式（O）");
        JMenu mSummon = new JMenu("查看（V）");
        JMenu mTalent = new JMenu("帮助（H）");

        // 菜单项
        mHero.add(new JMenuItem("新建（N）"));
        mHero.add(new JMenuItem("打开（O）"));
        mHero.add(new JMenuItem("保存（S）"));
        mHero.add(new JMenuItem("另存为（A）"));

        // 分隔符
        mHero.addSeparator();
        mHero.add(new JMenuItem("退出（X）"));

        mb.add(mHero);
        mb.add(mItem);
        mb.add(mWord);
        mb.add(mSummon);
        mb.add(mTalent);

        f.setJMenuBar(mb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}