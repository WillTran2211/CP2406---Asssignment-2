import javax.swing.*;
import java.awt.*;

public class CarsInFourWaysRoad extends JPanel {
    private VehicleMoving car9;
    private VehicleMoving car10;
    private VehicleMoving car11;
    private VehicleMoving car12;
    private VehicleMoving car13;
    private VehicleMoving car14;
    private VehicleMoving car15;


    CarsInFourWaysRoad() {
        setFocusable(true); // is false by default...
        setPreferredSize(new Dimension(800,200));
        setBackground(new Color(220,200,250));
    }

    void setCar9(VehicleMoving car9){this.car9 = car9;}
    void setCar10(VehicleMoving car10){this.car10 = car10;}
    void setCar11(VehicleMoving car11){this.car11 = car11;}
    void setCar12(VehicleMoving car12){this.car12 = car12;}
    void setCar13(VehicleMoving car13){this.car13 = car13;}
    void setCar14(VehicleMoving car14){this.car14 = car14;}
    void setCar15(VehicleMoving car15){this.car15 = car15;}

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        car9.draw(graphics);
        car10.draw(graphics);
        car11.draw(graphics);
        car12.draw(graphics);
        car13.draw(graphics);
        car14.draw(graphics);
        car15.draw(graphics);

        new Road().paintFourWays(graphics);
        new TrafficLight().paint(graphics);
    }
}
