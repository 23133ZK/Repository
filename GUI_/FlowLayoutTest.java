package GUI_;
import java.awt.*;
public class FlowLayoutTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();

        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮1");
        Button button3 = new Button("按钮1");

        frame.setSize(300,300);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setVisible(true);

    }
}
