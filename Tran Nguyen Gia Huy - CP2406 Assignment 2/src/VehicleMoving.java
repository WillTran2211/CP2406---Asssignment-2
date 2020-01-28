import java.awt.*;
import java.util.Random;

class VehicleMoving {
    private int x,y;
    private int xDir, yDir;

    private int width;
    private int length;
    private Color color;

    private static final Random random = new Random();

    VehicleMoving(int x, int y, int width, int length, Color color) {
        xDir = 1;
        yDir = 0;
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.color = color;
    }



    void stop(){
        //if (x == 350){
        System.out.println("**************");
        xDir = 0;
        yDir = 0;}


    //}

    void set_xDir(){
        xDir = 1;
    }
    void set_xDir2(){xDir = -1;}
    void set_yDir(){
        xDir = 0;
        yDir = 1;
    }

    void set_yDir2() {
        xDir = 0;
        yDir = -1;
    }

    void oneWayMove(Dimension size){
        x = x + xDir;
        y = y + yDir;

    }
    void move(Dimension size) {
        // update position based on current direction
        x = x + xDir;
        y = y + yDir;

        if(x>=500){

            this.width = 35;
            this.length = 70;

            xDir = 0;
            yDir = -1;
        }
    }

    void moveToLeft(Dimension size){
        x = x + xDir;
        y = y + yDir;
    }

    void moveToTop(Dimension size){
        x = x - xDir;
        y = y - yDir;
    }

    void moveToBottom(Dimension size){
        x = x - xDir;
        y = y - yDir;
    }

    void moveToRightAndBottom(Dimension size){
        x = x + xDir;
        y = y + yDir;

        if (x > 570){
            this.width = 35;
            this.length = 70;
            xDir = 0;
            yDir = 1;
        }
    }

    void moveToTopAndLeft(Dimension size){
        x = x + xDir;
        y = y + yDir;

        if (y < 265){
            this.width = 70;
            this.length = 35;
            xDir = -1;
            yDir = 0;
        }
    }

    void moveToTopAndRight(Dimension size){
        x = x + xDir;
        y = y + yDir;

        if (y < 215){
            this.width = 70;
            this.length = 35;

            xDir = 1;
            yDir = 0;
        }
    }

    void moveToBottonAndLeft(Dimension size){
        x = x + xDir;
        y = y + yDir;

        if (y > 250){
            this.width = 70;
            this.length = 35;
            xDir = -1;
            yDir = 0;
        }
    }

    void draw(Graphics graphics) {
        Graphics localGraphics = graphics.create(); // isolate changes here for: colour, transform, etc.
        localGraphics.setColor(color);
        localGraphics.fillRect(x, y, width, length);
        //localGraphics.drawOval(topLeftX, topLeftY, width, width);
        localGraphics.dispose();
    }
}
