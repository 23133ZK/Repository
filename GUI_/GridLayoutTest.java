package GUI_;

import java.awt.*;

public class GridLayoutTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();

        Button bn1 = new Button("bn1");
        Button bn2 = new Button("bn2");
        Button bn3 = new Button("bn3");
        Button bn4 = new Button("bn4");
        Button bn5 = new Button("bn5");

        frame.setLayout(new GridLayout(3,2));
        frame.add(bn1);
        frame.add(bn2);
        frame.add(bn3);
        frame.add(bn4);
        frame.add(bn5);

        frame.pack();
        frame.setVisible(true);
    }
}
