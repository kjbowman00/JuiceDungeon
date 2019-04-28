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

import java.awt.Color;
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
    public int xVelocity = 10;
    public int yVelocity = 10;
    public Shape sprite;
    
    public GameObject(int startX, int startY, SpriteLocation location) {
        x = startX;
        y = startY;
        sprite = new Rectangle(5, 5);
    }
    
    public void tick(long deltaTime) {
        x += xVelocity * deltaTime;
        y += yVelocity * deltaTime;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 100, 100);
        g.drawOval(x, y, 100, 100);
        g.fillOval(x, y, 100, 100);
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
