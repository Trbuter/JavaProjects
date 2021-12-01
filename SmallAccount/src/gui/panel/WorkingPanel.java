package gui.panel;

import javax.swing.*;

/**
 * @Program: SmallAccount
 * @Description: 抽象界面类，强制子类实现两个方法
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public abstract class WorkingPanel extends JPanel {
    public abstract void updateData();
    public abstract void addListener();
}
