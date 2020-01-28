import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;

public class TrafficLight extends JPanel {


    public void paint(Graphics g){

        g.fillRect(500,100,10,100);
        g.setColor(Color.red);
    }
}


