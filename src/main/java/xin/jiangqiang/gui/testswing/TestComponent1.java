package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * @author jiangqiang
 * @date 2020/11/15 10:27
 */
public class TestComponent1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("LoL");
        jFrame.setSize(400, 450);
        jFrame.setLocation(200, 200);
        jFrame.setLayout(null);
        JLabel jLabelText = new JLabel("LOL文字");
        //文字颜色
        jLabelText.setForeground(Color.red);
        jLabelText.setBounds(50, 50, 280, 30);

        jFrame.add(jLabelText);


        JLabel jLabelImg = new JLabel();

        //根据图片创建ImageIcon对象
        ImageIcon i = new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png")));

        //设置ImageIcon
        jLabelImg.setIcon(i);
        //label的大小设置为ImageIcon,否则显示不完整
        jLabelImg.setBounds(10, 200, i.getIconWidth(), i.getIconHeight());

        jFrame.add(jLabelImg);

        JButton jButton = new JButton("按钮");
        jButton.setBounds(10, 10, 80,40);
        jFrame.add(jButton);

        JCheckBox bCheckBox = new JCheckBox("物理英雄");
        //设置 为 默认被选中
        bCheckBox.setSelected(true);
        bCheckBox.setBounds(150, 20, 130, 30);
        JCheckBox bCheckBox2 = new JCheckBox("魔法英雄");
        bCheckBox2.setBounds(150, 50, 130, 30);

        JRadioButton jRadioButton1 = new JRadioButton("物理英雄");
        jFrame.add(bCheckBox);
        jFrame.add(bCheckBox2);

        // 设置 为 默认被选中
        jRadioButton1.setSelected(true);
        jRadioButton1.setBounds(50, 80, 130, 30);
        JRadioButton jRadioButton2 = new JRadioButton("魔法英雄");
        jRadioButton2.setBounds(50, 130, 130, 30);

        System.out.println(jRadioButton2.isSelected());

        jFrame.add(jRadioButton1);
        jFrame.add(jRadioButton2);
        //判断 是否 被 选中
        System.out.println(bCheckBox2.isSelected());
        // 按钮分组

        ButtonGroup bg = new ButtonGroup();
        // 把单选框放在同一个按钮分组对象里这样同一时间，只有一个单选框会被选中
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);

        String[] heros = new String[] { "卡特琳娜", "库奇" };
        JComboBox comboBox = new JComboBox(heros);

        comboBox.setBounds(200, 150, 80, 30);
        jFrame.add(comboBox);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

        //JOptionPane用于弹出对话框
        int option = JOptionPane.showConfirmDialog(jFrame, "是否 使用外挂 ？");
        if (JOptionPane.OK_OPTION == option) {
            String answer = JOptionPane.showInputDialog(jFrame, "请输入yes，表明使用外挂后果自负");
            if ("yes".equals(answer))
                JOptionPane.showMessageDialog(jFrame, "你使用外挂被抓住！ 罚拣肥皂3次！");
        }
    }
}
