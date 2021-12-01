package gui.panel;

import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @Program: SmallAccount
 * @Description: 界面类 MainPanel主界面
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public class MainPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static MainPanel instance = new MainPanel();
    private JToolBar tb = new JToolBar();
    public JButton bSpend = new JButton();
    public JButton bRecord = new JButton();
    public JButton bHistory = new JButton();
    public JButton bCategory = new JButton();
    public JButton bReport = new JButton();
    public JButton bConfig = new JButton();
    public JButton bBackup = new JButton();
    public JButton bRecover = new JButton();
    public CenterPanel workingPanel;

    private MainPanel() {
        GUIUtil.setImageIcon(bSpend, "home.png", "本月一览");
        GUIUtil.setImageIcon(bRecord, "record.png", "记一笔");
        GUIUtil.setImageIcon(bHistory, "history.png", "历史消费");
        GUIUtil.setImageIcon(bReport, "report.png", "月消费报表");
        GUIUtil.setImageIcon(bCategory, "category.png", "消费分类");
        GUIUtil.setImageIcon(bConfig, "config.png", "设置");
        GUIUtil.setImageIcon(bBackup, "backup.png", "备份");
        GUIUtil.setImageIcon(bRecover, "restore.png", "恢复");
        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bHistory);
        tb.add(bReport);
        tb.add(bCategory);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);
        tb.setFloatable(false);
        workingPanel=new CenterPanel(0.85);
        this.setLayout(new BorderLayout());
        this.add(tb,BorderLayout.NORTH);
        this.add(workingPanel,BorderLayout.CENTER);
    }
}
