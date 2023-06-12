package GUI_;

import java.awt.*;

public class FrameTest_02
{
    public static void main(String[] args)
    {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.black);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.yellow);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.red);
    }
}


class MyFrame extends Frame
{
    static int id=0;//可能有多个窗口。需要计数器
    public MyFrame(int x, int y ,int w,int h,Color color)
    {
        super("MyFrame+"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}