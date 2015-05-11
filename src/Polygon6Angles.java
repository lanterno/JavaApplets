import java.applet.Applet;
import java.awt.*;

/**
 * Created by zee on 5/11/15.
 */
public class Polygon6Angles extends Applet{
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.RED);
        g2d.fillOval(100, 100, 400, 400);
        Polygon p = new Polygon();
        int r=200, c1=300, c2=300, roundang;
        roundang = (360/6)/2;
        int x1, x2, y1, y2;
        x1 = (int)(c1 + r*Math.cos(roundang * 3.14 / 180));
        y1 = (int)(c2 - r*Math.sin(roundang*3.14/180));
        p.addPoint(x1, y1);
        for (int i=roundang; i<=360+roundang; i+=360/6){
            x2 = (int)(c1 + r*Math.cos(i * 3.14 / 180));
            y2 = (int)(c2 - r*Math.sin(i*3.14/180));
            p.addPoint(x2, y2);
        }

        Polygon p8 = new Polygon();
        roundang = (360/8)/2;
        x1 = (int)(c1 + r*Math.cos(roundang * 3.14 / 180));
        y1 = (int)(c2 - r*Math.sin(roundang*3.14/180));
        p8.addPoint(x1, y1);
        for (int i=roundang; i<=360+roundang; i+=360/8){
            x2 = (int)(c1 + r*Math.cos(i * 3.14 / 180));
            y2 = (int)(c2 - r*Math.sin(i*3.14/180));
            p8.addPoint(x2, y2);
        }
        g2d.setColor(Color.yellow);
        g2d.fillPolygon(p8);
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(p);
        g2d.setColor(Color.green);
        g2d.fillOval(127, 127, 344, 344);

        Polygon p6_2 = new Polygon();
        r=344/2;
        c1=(int)(127 + (344/2));
        c2=(int)(127 + (344/2));
        roundang = (360/6)/2;
        x1 = (int)(c1 + r*Math.cos(roundang * 3.14 / 180));
        y1 = (int)(c2 - r*Math.sin(roundang*3.14/180));
        p6_2.addPoint(x1, y1);
        for (int i=roundang; i<=360+roundang; i+=360/6){
            x2 = (int)(c1 + r*Math.cos(i * 3.14 / 180));
            y2 = (int)(c2 - r*Math.sin(i*3.14/180));
            p6_2.addPoint(x2, y2);
        }

        Polygon p8_2 = new Polygon();
        roundang = (360/8)/2;
        x1 = (int)(c1 + r*Math.cos(roundang * 3.14 / 180));
        y1 = (int)(c2 - r*Math.sin(roundang*3.14/180));
        p8_2.addPoint(x1, y1);
        for (int i=roundang; i<=360+roundang; i+=360/8){
            x2 = (int)(c1 + r*Math.cos(i * 3.14 / 180));
            y2 = (int)(c2 - r*Math.sin(i*3.14/180));
            p8_2.addPoint(x2, y2);
        }
        g2d.setColor(Color.CYAN);
        g2d.fillPolygon(p8_2);
        g2d.setColor(Color.orange);
        g2d.fillPolygon(p6_2);


    }

}
