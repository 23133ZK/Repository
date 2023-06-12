package GUI_;
import java.awt.*;
public class BorderLayoutTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();

        Button e = new Button("E");
        Button w = new Button("W");
        Button s = new Button("S");
        Button n = new Button("N");
        Button c = new Button("C");

        frame.add(e,BorderLayout.EAST);
        frame.add(w,BorderLayout.WEST);
        frame.add(s,BorderLayout.SOUTH);
        frame.add(n,BorderLayout.NORTH);
        //frame.add(c,BorderLayout.CENTER);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
