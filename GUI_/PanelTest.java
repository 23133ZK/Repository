package GUI_;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();
        Panel panel = new Panel();
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,30,50));
        panel.setBounds(0,0,400,400);
        panel.setBackground(new Color(193,15,60));
        frame.add(panel);
        frame.setVisible(true);

        //监听窗口关闭事件 System.exit(0);
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });


    }
}
