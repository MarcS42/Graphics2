package Graphics2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
//    Bouncer movingSprite;
    ArrayList<Mover> movers= new ArrayList<Mover>();
//    ArrayList<StraightMover> straights = new ArrayList<StraightMover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        
        Rectangle box = new Rectangle(15, 30, Color.RED);
        Rectangle box2 = new Rectangle(30,15, Color.BLUE);
        Oval oval1 = new Oval(30,20, Color.ORANGE);
//        movingSprite = new Bouncer(100, 170, 3,1, box);
        movers.add(new Bouncer(100, 170, 3,1, box));
        movers.add(new Bouncer(170,100,1,3,box2));
        movers.add(new Bouncer(17,10,4,3,oval1));
        movers.add(new StraightMover(10,17,1,1,oval1));
        movers.add(new StraightMover(20,50,1,1,box2));
//        movingSprite.setMovementVector(3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover:movers)  // notice no semicolon on Enhanced for statement
        mover.draw(surface);
//        for (StraightMover straight:straights)// notice no semicolon on Enhanced for statement
//        straight.draw(surface);
    }
}
