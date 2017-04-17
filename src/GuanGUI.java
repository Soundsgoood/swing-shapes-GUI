import java.awt.*;
import javax.swing.*;
import edu.truman.cs260.guan.icon.DisplayShape;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * A simple GUI with buttons to change the shape and color of an icon.
 * @author Orion Guan
 * @version April 11th, 2017
 */
public class GuanGUI
{
	final static int SHAPE_SIZE = 100;
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		JButton squareButton = new JButton("Square");
		JButton circleButton = new JButton("Circle");
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");
		frame.add(squareButton);
		frame.add(circleButton);
		frame.add(redButton);
		frame.add(blueButton);
		
		DisplayShape displayShape = new DisplayShape(SHAPE_SIZE);
		JLabel displayShapeLabel = new JLabel(displayShape);
		frame.add(displayShapeLabel);
		
		squareButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				displayShape.setShape("Square");
				displayShapeLabel.repaint();
			}});
		circleButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				displayShape.setShape("Circle");
				displayShapeLabel.repaint();
			}});
		redButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				displayShape.setColor(Color.RED);
				displayShapeLabel.repaint();
			}});
		blueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				displayShape.setColor(Color.BLUE);
				displayShapeLabel.repaint();
			}});
		
		displayShapeLabel.repaint();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
