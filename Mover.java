package Graphics2;

import java.awt.Graphics;

public interface Mover {
/**This interface is supposed to simplify DrawGraphics class by housing common methods here
 *    Also it allows you to create a single Movers ArrayList in DrawGraphics, rather than
 *    using one for Straight movers and one for Bouncers.
 *    Not sure it's worth it.
 *    Remember: interfaces can't specify Constructors, only methods.
 * @param xIncrement
 * @param yIcncrement
 */
    
    public void setMovementVector(int xIncrement, int yIcncrement);
    
    public void draw(Graphics surface);

}
