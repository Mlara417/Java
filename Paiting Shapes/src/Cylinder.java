public class Cylinder extends Shape {
	protected double height;
	protected double radius;
	
	public Cylinder() {
		this("No Cylinder", -1, -1);
	}

	public Cylinder(String shapeName, double height, double radius) {
		super(shapeName);
		this.height = height;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius * height;
	}

	public String toString() 
	{ 
		return super.toString() + " with a radius of " + radius + " and a height " + height + "."; 
	}
}