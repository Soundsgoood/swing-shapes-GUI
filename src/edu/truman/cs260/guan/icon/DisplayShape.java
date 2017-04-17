package edu.truman.cs260.guan.icon;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;

/**
 * The shape the user may change into a square or circle and may change color.
 * @author Orion Guan
 * @version April 11th, 2017.
 */
public class DisplayShape implements Icon
{
	private int size;
	private String shapeString = "Square"; //tells paintIcon the shape to paint
	private Color color = Color.RED;
	
	/**
	 * Creates a shape to be displayed in the GUI.
	 * @param size The side length of a square or diameter of a circle, in
	 * pixels.
	 */
	public DisplayShape(int size)
	{
		this.size = size;
	}
	
	/**
	 * Returns the width of the shape.
	 * @return The width of the shape.
	 */
	public int getIconWidth()
	{
		return size;
	}
	
	/**
	 * Returns the height of the shape.
	 * @return The height of the shape.
	 */
	public int getIconHeight()
	{
		return size;
	}
	
	/**
	 * Defines the actual shapes belonging to this Icon object.
	 * @param c The Component the shapes are defined in.
	 * @param g The Graphics context object.
	 * @param x The x-location of the reference point of the shapes.
	 * @param y The y-location of the reference point of the shapes.
	 */
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;
		Shape shape;
		if (shapeString.equals("Square"))
		{
			shape = new Rectangle2D.Double(x, y, size, size);
		}
		else if (shapeString.equals("Circle"))
		{
			shape = new Ellipse2D.Double(x, y, size, size);
		}
		else
		{
			System.out.println("Can't paint this shape. Defaulted to square.");
			shape = new Rectangle2D.Double(x, y, size, size);
		}
		g2.setColor(color);
		g2.fill(shape);
	}
	
	/**
	 * Changes the shape.
	 * @param shapeString The String associated with the desired shape.
	 */
	public void setShape(String shapeString)
	{
		this.shapeString = shapeString;
	}
	
	/**
	 * Changes the color.
	 * @param color The Color object associated with the desired color.
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
}
