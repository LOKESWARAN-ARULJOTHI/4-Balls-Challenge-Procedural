import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 1400;
    public static final int HEIGHT = 800;
    public static final int HEIGHT1 = (HEIGHT) / 5;
    public static final int HEIGHT2 = (HEIGHT * 2) / 5;
    public static final int HEIGHT3 = (HEIGHT * 3) / 5;
    public static final int HEIGHT4 = (HEIGHT * 4) / 5;
    public static final int DIAMETER = 10;
    public static int speed = 0;


    public static void main(String[] args) {
        PApplet.main("FourBalls");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(220);
    }

    @Override
    public void draw() {
        speed++;
        int speed2 = speed * 2;
        int speed1 = speed;
        int speed3 = speed * 3;
        int speed4 = speed * 4;
        ellipse(speed1, HEIGHT1, DIAMETER,DIAMETER);
        ellipse(speed2, HEIGHT2, DIAMETER,DIAMETER);
        ellipse(speed3, HEIGHT3, DIAMETER,DIAMETER);
        ellipse(speed4, HEIGHT4, DIAMETER,DIAMETER);

        if (speed == 1400)
        {
            background(220);
            speed = 0;
        }
    }
}

