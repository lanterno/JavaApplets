import java.applet.Applet;
import java.awt.*;

/**
 * Created by Ahmed Saad Ahmed on 5/11/15.
 * Description: draws a cartoon that closes and opens his eyes
 */
public class SmileyMovingFace extends Applet{
    public int sleep = 0; // Awake
    public void paint(Graphics g){
        // ears
        // right ear
        g.setColor(Color.PINK);
        int ear_x[] = {300, 400, 415, 400, 300};
        int ear_y[] = {100, 80, 120, 160, 160};
        g.fillPolygon(ear_x, ear_y, 5);
        // left ear
        int l_ear_x[] = {90, 60, 45, 60, 90};
        g.fillPolygon(l_ear_x, ear_y, 5);

        // face
        g.setColor(Color.yellow);
        int x[] = {70, 120, 325, 370};
        int y[] = {70, 350, 350, 50};
        g.fillPolygon(x, y, 4);

        // hair
        g.setColor(Color.black);
        int h_x[] = {70, 370, 370, 70};
        int h_y[] = {70, 50, 45, 65};
        g.fillPolygon(h_x, h_y, 4);

        // glasses
        g.setColor(Color.black);
        g.drawRect(115, 100, 75, 75); // left
        g.drawRect(245, 100, 75, 75); // right
        g.drawLine(190, 125, 245, 125); // between
        g.drawLine(50, 110, 115, 135); // left hand
        g.drawLine(320, 135, 410, 120); // right hand

        // eyes
        g.setColor(Color.cyan);
        g.fillOval(115, 100, 50, 50);
        g.fillOval(245, 100, 50, 50);

        //mouse
        g.setColor(Color.DARK_GRAY);
        g.fillOval(150, 310, 150, 20);

        // sleep or not to sleep ?

        int s_x_l[] = {115, 115, 190, 190};
        int s_y_l[] = {100, 165, 155, 100};
        int s_x_r[] = {245, 245, 320, 320};
        int s_y_r[] = {100, 155, 165, 100};
        ////  Awake mode
        int awake_x_l[] = {115, 115, 190, 190};
        int awake_y_l[] = {100, 107, 102, 100};
        int awake_x_r[] = {245, 245, 320, 320};
        int awake_y_r[] = {100, 102, 107, 100};

        if(sleep == 0){
            sleep = 1;
            g.fillPolygon(s_x_r, s_y_r, 4);
            g.fillPolygon(s_x_l, s_y_l, 4);
        }
        else{
            sleep = 0;
            g.fillPolygon(awake_x_r, awake_y_r, 4);
            g.fillPolygon(awake_x_l, awake_y_l, 4);
        }
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException ex) {}
        repaint();


    }

}
