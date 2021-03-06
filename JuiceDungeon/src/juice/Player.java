/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Rohan Muthukumar (rohanm14)
 */
package juice;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @version 04/27/2019
 */
public class Player extends GameObject {

    /**
     * @param startX
     * @param startY
     * @param location
     */
    public Player(int startX, int startY) {
        super(startX, startY, new SpriteLocation(0,0, 100, 100));
    }

}
