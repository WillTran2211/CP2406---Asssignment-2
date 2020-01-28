import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;


public class Main{
    JFrame frame = new JFrame("CarTrafficSimulator");
    CarsInFourWaysRoad fourWays = new CarsInFourWaysRoad();
    JPanel trafficBoard = new JPanel();
    JPanel trafficBoard2 = new JPanel();
    JLabel countdownText = new JLabel();
    JPanel buttonPanel = new JPanel();

    JButton fourRoadsMode = new JButton("Traffic Simulator");
    final Color[] color = {new Color(0, 255, 0)};

    public void fourWays(){
        frame.remove(trafficBoard);
        frame.remove(trafficBoard2);
        VehicleMoving car9 = new VehicleMoving(500, 510, 35, 70, Color.gray);
        VehicleMoving car10 = new VehicleMoving(585, -160, 35, 70, Color.yellow);
        VehicleMoving car11 = new VehicleMoving(180, 200, 70, 35, Color.cyan);
        VehicleMoving car12 = new VehicleMoving(100, 200, 70, 35, Color.orange);
        VehicleMoving car13 = new VehicleMoving(500, 600, 35, 70, Color.BLUE);
        VehicleMoving car14 = new VehicleMoving(585, -80, 35, 70, Color.red);
        VehicleMoving car15 = new VehicleMoving(20,200,70,35,Color.magenta);
//        VehicleMoving car16 = new VehicleMoving(500,520,35,70,Color.cyan);
//        VehicleMoving car9 = new VehicleMoving()
        fourWays.setCar9(car9);
        fourWays.setCar10(car10);
        fourWays.setCar11(car11);
        fourWays.setCar12(car12);
        fourWays.setCar13(car13);
        fourWays.setCar14(car14);
        fourWays.setCar15(car15);
//        fourWays.setCar16(car16);


        trafficBoard.setFocusable(true);
        trafficBoard.setPreferredSize(new Dimension(300, 80));
        trafficBoard.setBackground(Color.GREEN);
        trafficBoard.add(countdownText);
        frame.add(trafficBoard, BorderLayout.NORTH);

        trafficBoard2.setFocusable(true);
        trafficBoard2.setPreferredSize(new Dimension(80, 600));
        trafficBoard2.setBackground(Color.GREEN);
//        trafficBoard2.add(countdownText);
        frame.add(trafficBoard2, BorderLayout.EAST);

        java.util.Timer timer2 = new java.util.Timer();
        timer2.scheduleAtFixedRate(new TimerTask() {
            Color light_color = Color.GREEN;
            int countDown = 3;

            @Override
            public void run() {
                countDown = countDown - 1;
                switch (countDown) {
                    case -1:
                        light_color = Color.red;
                        trafficBoard.setBackground(light_color);
                        countDown = 14;
                        break;
                    case 7:
                        light_color = Color.GREEN;
                        trafficBoard.setBackground(light_color);
                        new TrafficLight().repaint();
                        break;
                }
                if (Color.red.equals(light_color)) {
                    car9.stop();
                    car10.stop();
                    car11.set_xDir();
                    car12.set_xDir();
                    car11.move(fourWays.getSize());
                    car12.moveToRightAndBottom(fourWays.getSize());
                    car13.stop();
                    car14.stop();
//                    car16.stop();
                } else if (Color.GREEN.equals(light_color)) {
                    car9.set_yDir();
                    car9.moveToTop(fourWays.getSize());
                    car10.set_yDir2();
                    car10.moveToBottom(fourWays.getSize());
                    car13.set_yDir2();
                    car13.moveToTopAndLeft(fourWays.getSize());
                    car14.set_yDir();
                    car14.moveToBottonAndLeft(fourWays.getSize());
                    car15.set_xDir();
                    car15.moveToLeft(fourWays.getSize());
//                    car16.set_yDir2();
//                    car16.moveToTopAndRight(fourWays.getSize());
//                    car11.stop();
//                    car12.stop();
                }
                countdownText.setText(String.valueOf(countDown));
            }

        }, 0, 1000);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car9.moveToTop(fourWays.getSize());
                car10.moveToBottom(fourWays.getSize());
                car11.move(fourWays.getSize());
                car12.moveToRightAndBottom(fourWays.getSize());
                car13.moveToTopAndLeft(fourWays.getSize());
                car14.moveToBottonAndLeft(fourWays.getSize());
                car15.moveToLeft(fourWays.getSize());
//                car16.moveToTopAndRight(fourWays.getSize());
                fourWays.repaint();
            }
        });
        timer.start();
        frame.add(fourWays, BorderLayout.CENTER);
    }
    public void showGUI() {
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(fourRoadsMode);
        frame.add(buttonPanel, "South");
        fourRoadsMode.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 26));

        fourRoadsMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Switch to 4 ways");
                fourWays();
            }
        });

        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.oneWay();
//        main.CarsInThreeWaysRoad();
        main.fourWays();
        main.showGUI();
    }
}