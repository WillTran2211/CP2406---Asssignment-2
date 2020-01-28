import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

public class testCountdown {

    public static void main(String[] args) {
        java.util.Timer timer2 = new java.util.Timer();

        timer2.scheduleAtFixedRate(new TimerTask() {
            int countdown = 10;
            @Override
            public void run() {

                countdown = countdown - 1;
                System.out.println(countdown);
            }
        }, 0, 1000);
    }
}


