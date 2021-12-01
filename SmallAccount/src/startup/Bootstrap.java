package startup;

import gui.frame.MainFrame;
import gui.panel.MainPanel;
import gui.panel.SpendPanel;
import util.GUIUtil;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @Program: SmallAccount
 * @Description:
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public class Bootstrap {
    public static void main(String[] args) throws Exception {
        GUIUtil.useLNF();
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                MainFrame.instance.setVisible(true);
                MainPanel.instance.workingPanel.show(SpendPanel.instance);
            }
        });
    }
}
