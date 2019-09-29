
public class Rectangle extends Shape {
	protected double width;
	protected double height;

	public Rectangle() {
		this("Not Rectangle", -1, -1);
	}

	public Rectangle(String shapeName, double width, double height) {
		super(shapeName);
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public String toString() 
	{ 
		return super.toString() + " with a width of " + width + " and a height of " + height + "."; 
	}
}