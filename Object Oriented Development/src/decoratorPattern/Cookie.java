package decoratorPattern;

public class Cookie implements Desserts {
	@Override
	public void show() {
		System.out.print("Cookie ");
	}
}