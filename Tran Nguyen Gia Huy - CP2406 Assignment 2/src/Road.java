import javax.swing.*;
import java.awt.*;

public class Road extends JPanel{
    public void paintOneway(Graphics g){
        g.drawLine(100,100,400,100);
        g.drawLine(100,150,155,150);
        g.drawLine(175,150,230,150);
        g.drawLine(250,150,305,150);
        g.drawLine(325,150,380,150);
        g.drawLine(100,200,400,200);

        g.drawLine(600,100,900,100);
        g.drawLine(600,150,655,150);
        g.drawLine(675,150,730,150);
        g.drawLine(750,150,805,150);
        g.drawLine(825,150,880,150);
        g.drawLine(600,200,900,200);

    }

    public void paintThreeways(Graphics g){
        g.drawLine(100,200,500,200);
        g.drawLine(133,250,213,250);
        g.drawLine(246,250,326,250);
        g.drawLine(359,250,439,250);
        g.drawLine(472,250,500,250);
        g.drawLine(100,300,500,300);

        g.drawLine(500,10,500,200);
        g.drawLine(620,10,620,600);
        g.drawLine(500,300,500,600);
        g.drawLine(560,10,560,80);
        g.drawLine(560,120,560,200);
        g.drawLine(560,300,560,370);
        g.drawLine(560,410,560,480);
        g.drawLine(560,520,560,600);
    }

    public void paintFourWays(Graphics g){
        g.drawLine(100,200,500,200);
        g.drawLine(133,250,213,250);
        g.drawLine(246,250,326,250);
        g.drawLine(359,250,439,250);
        g.drawLine(472,250,500,250);
        g.drawLine(100,300,500,300);

        g.drawLine(500,10,500,200);
        g.drawLine(620,10,620,200);
        g.drawLine(620,200, 900, 200);
        g.drawLine(620,300,620,600);
        g.drawLine(500,300,500,600);
        g.drawLine(620,300,900,300);
        g.drawLine(560,10,560,80);
        g.drawLine(560,120,560,200);
        g.drawLine(560,300,560,370);
        g.drawLine(560,410,560,480);
        g.drawLine(560,520,560,600);
        g.drawLine(620,250,700,250);
        g.drawLine(733,250,813,250);
        g.drawLine(846,250, 900,250);
    }
}
