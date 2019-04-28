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

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @version 04/27/2019
 */
public class GameObject {
   
    public int x;
    public int y;
    public int xVelocity = 1;
    public int yVelocity = 1;
    public Shape sprite;
    
    public GameObject(int startX, int startY, SpriteLocation location) {
        x = startX;
        y = startY;
        sprite = new Rectangle(5, 5);
    }
    
    public void tick() {
        x += xVelocity;
        y += yVelocity;
    }
    
    public void draw(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.drawRect(50, 50, 75, 75);
    }

    public void setXVelocity(int v) {
        xVelocity = v;
    }
    
    public void setYVelocity(int v) {
        yVelocity = v;
    }
    
    public int getXVelocity() {
        return xVelocity;
    }
    
    public int getYVelocity() {
        return yVelocity;
    }
}
