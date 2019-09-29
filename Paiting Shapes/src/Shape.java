public abstract class Shape {
	protected String shapeName;
	public Shape() {
		this("Not a shape");
		}
	
	Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public abstract double area();
	
	public String toString() {
		return shapeName;
	}
}
