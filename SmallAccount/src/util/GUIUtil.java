package util;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @Program: SmallAccount
 * @Description:工具类 GUIUtil GUI的各种常用工具
 * @Author: Trbuter
 * @Create: 2021-12-01
 */
public class GUIUtil {
    //图片的文件夹
    private static final String imgFolder="resources/img/";
    //定义皮肤
    public static void useLNF(){
        try {
            javax.swing.UIManager.setLookAndFeel("com.pagosoft.plaf.PgsLookAndFeel");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 把一个按钮设置成图文形式
     * @param b 按钮
     * @param fileName 图片名
     * @param tip 按钮下文字
     */
    public static void setImageIcon(JButton b,String fileName,String tip){
        ImageIcon i=new ImageIcon((new File(imgFolder,fileName)).getAbsolutePath());
        b.setIcon(i);
        b.setPreferredSize(new Dimension(61,81));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setText(tip);
    }

    /**
     * 把若干个组件设置成指定颜色
     * @param color
     * @param cs
     */
    public static void setColor(Color color,JComponent... cs) {
        for (JComponent c : cs) {
            c.setForeground(color);
        }
    }
}
