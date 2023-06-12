package GUI_;
import java.awt.*;

//GUI的第一个界面
public class FrameTest
{
    public static void main(String[] args)
    {
        //Frame JDK 看源码
        Frame frame = new Frame("我的第一个java图像界面窗口");
        //需要设置可见性 wide high
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(250,250);
        //设置窗口颜色
        frame.setBackground(new Color(21, 40, 20));
        //弹出初始位置
        frame.setLocation(200,200);
        frame.setResizable(false);
    }
}
