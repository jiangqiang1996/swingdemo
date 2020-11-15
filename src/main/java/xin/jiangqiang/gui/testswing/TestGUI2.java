package xin.jiangqiang.gui.testswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * @author jiangqiang
 * @date 2020/11/13 15:42
 */
public class TestGUI2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("title");
        jFrame.setSize(400, 300);
        jFrame.setLocation(280, 200);
        jFrame.setLayout(null);

        final JLabel jLabel = new JLabel();

        ImageIcon i = new ImageIcon(Objects.requireNonNull(TestGUI2.class.getClassLoader().getResource("1.png")));
        jLabel.setIcon(i);
        jLabel.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        JButton button = new JButton("隐藏");
        button.setBounds(150, 200, 100, 30);

        // 给按钮 增加 监听
        button.addActionListener(new ActionListener() {
            boolean flag = false;
            String text = "显示";
            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
            public void actionPerformed(ActionEvent e) {
                jLabel.setVisible(flag);
                flag = !flag;
                button.setText(text);
                text = text.equals("显示") ? "隐藏" : "显示";
            }
        });

        jFrame.add(jLabel);
        jFrame.add(button);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}

