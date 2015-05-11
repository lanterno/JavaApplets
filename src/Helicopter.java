import java.applet.Applet;
import java.awt.*;

/**
 * Created by zee on 5/11/15.
 */
public class Helicopter extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // top horizontal line
        g2d.drawLine(50, 50, 100, 50);
        // mostleft vertical line
        g2d.drawLine(50, 50, 50, 200);
        // bottom horizontal line
        g2d.drawLine(50, 200, 355, 200);
        // 2nd from left vertical line
        g2d.drawLine(100, 50, 100, 100);
        // 2nd from top horizontal line
        g2d.drawLine(100, 100, 290, 100);
        // rightmost vertical line
        g2d.drawLine(290, 100, 290, 70);
        // the hellicopter's face
        g2d.drawArc(190, 70, 200, 150, 312, 140);
        //back fan
        g2d.fillArc(25, 25, 50, 50, 20, 45);
        g2d.fillArc(25, 25, 50, 50, 110, 45);
        g2d.fillArc(25, 25, 50, 50, 200, 45);
        g2d.fillArc(25, 25, 50, 50, 290, 45);
        //front fan
        g2d.fillArc(240, 35, 100, 70, 20, 30);
        g2d.fillArc(240, 35, 100, 70, 110, 30);
        g2d.fillArc(240, 35, 100, 70, 200, 30);
        g2d.fillArc(240, 35, 100, 70, 290, 30);
    }
}
