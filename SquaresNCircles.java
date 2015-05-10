import java.applet.*;
import java.awt.*;

/**
 * Created by Ahmed Saad Ahmed Ibrahim on 5/11/15.
 * Description: this class draws a circle inside square pattern using Java Applets.
 */
public class SquaresNCircles extends Applet {
    public void paint(Graphics g) {
//        some random colors to choose from
        Color colors[] = {Color.red, Color.BLUE, Color.green, Color.orange, Color.CYAN};
//        initial start point for both x, y points.
        int point = 20;
//        initial length for both the width and the height of the square.
        int length = 600;
//        drawing the figure..
//        each cycle for one cycle and one square.
        for(int i=0; i<5; i++){
//            a default color "Brown" for the squares
            g.setColor(new Color(107, 69, 38));
            g.fillRect(point, point, length, length);
//            a different color for each circle
            g.setColor(colors[i]);
            g.fillOval(point, point, length, length);
            point = point + (int)((length/2.0)*(Math.sqrt(2.0) - 1.0)*Math.sin(45*3.14/180));
            length = length - (int)(2*((length/2.0)*(Math.sqrt(2.0) - 1.0)*Math.sin(45*3.14/180)));
        }

    }
}
