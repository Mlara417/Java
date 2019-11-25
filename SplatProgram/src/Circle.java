import java.awt.*;

public class Circle {

	private int diameter, x, y;
	private Color color;
	
	//Constructor: sets up this circle with specified values
	
	public Circle(int size, Color shade, int upperX, int upperY) {
		
		diameter = size;
		color = shade;
		x = upperX;
		y = upperY;
		
	}
	
	//Draws this circle in the specified graphics context
	
	public void draw(Graphics page) {
		
		page.setColor(color);
		page.fillOval(x, y, diameter, diameter);
		
	}
	
	//Diameter mutator
	
	public void setDiameter(int size) {
		
		diameter = size;
		
	}
	
	//Color mutator
	
	public void setColor(Color shade) {
		
		color = shade;
		
	}
	
	// x mutator
	
	public void setX(int upperX) {
		
		x = upperX;
		
	}
	
	// y mutator
	
	public void setY(int upperY) {
		
		y = upperY;
		
	}
	
	// Diameter accessor
	
	public int getDiameter() {
		
		return diameter;
		
	}
	
	// Color accessor
	
	public Color getColor() {
		
		return color;
		
	}
	
	// x accessor
	
	public int getX() {
		
		return x;
		
	}
public int getY() {
		
		return y;
		
	}
	
}
