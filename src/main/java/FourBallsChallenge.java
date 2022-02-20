import processing.core.PApplet;

class Ellipse {
    private int movementAlongX = 0;
    private final int diameter;

    public Ellipse(int diameter) {
        this.diameter = diameter;
    }

    void incrementMovement(int increment) {
        movementAlongX += increment;
    }

    public int getMovementAlongX() {
        return movementAlongX;
    }

    public int getDiameter() {
        return diameter;
    }
}

public class FourBallsChallenge extends PApplet {

    int WIDTH = 480;
    int HEIGHT = 720;
    int diameter = 10;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    Ellipse ellipse1 = new Ellipse(diameter);
    Ellipse ellipse2 = new Ellipse(diameter);
    Ellipse ellipse3 = new Ellipse(diameter);
    Ellipse ellipse4 = new Ellipse(diameter);

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ellipse1.getMovementAlongX(), (float) HEIGHT / 5, ellipse1.getDiameter(), ellipse2.getDiameter());
        ellipse(ellipse2.getMovementAlongX(), (float) HEIGHT * 2 / 5, ellipse2.getDiameter(), ellipse2.getDiameter());
        ellipse(ellipse3.getMovementAlongX(), (float) HEIGHT * 3 / 5, ellipse3.getDiameter(), ellipse3.getDiameter());
        ellipse(ellipse4.getMovementAlongX(), (float) HEIGHT * 4 / 5, ellipse4.getDiameter(), ellipse4.getDiameter());

        ellipse1.incrementMovement(1);
        ellipse2.incrementMovement(2);
        ellipse3.incrementMovement(3);
        ellipse4.incrementMovement(4);

    }

}