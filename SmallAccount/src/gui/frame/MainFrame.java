package gui.frame;

import gui.panel.MainPanel;
import util.GUIUtil;

import javax.swing.*;

/**
 * @Program: SmallAccount
 * @Description: 程序主窗体 设置程序窗体的长度标题和退出操作等
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public class MainFrame extends JFrame {
    static {
        GUIUtil.useLNF();
    }
    public static MainFrame instance=new MainFrame();
    private MainFrame(){
        this.setSize(513,450);
        this.setTitle("小小记账本");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        instance.setVisible(true);
    }
}
