import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

public class SplatPanel extends JPanel {
	
	private Circle circle1;
	public SplatPanel(int size,  String color, int upperX, int upperY) {
		
		Color color2;
		
		try {
			Field field = Class.forName("java.awt.Color").getField(color);
			color2 = (Color)field.get(null);
		} catch (Exception e) {
			
			color2 = null;
			
		}
		
		
		circle1 = new Circle(size, color2, upperX, upperY);
		setPreferredSize(new Dimension(300, 200));
		setBackground(Color.black);
	
	}
	
	//Draws this panel by requesting that each circle draws itself.
	public void paintComponent(Graphics page) {
		
		super.paintComponent(page);
		circle1.draw(page);
	
	}
	
}
