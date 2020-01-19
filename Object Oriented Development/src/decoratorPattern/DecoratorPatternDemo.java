package decoratorPattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Desserts cookie = new Cookie();
		Desserts sweetCookie = new SweetDessertDecorator(new Cookie());

		Desserts sweetPie = new SweetDessertDecorator(new Pie());

		System.out.println("Normal cookie");
		cookie.show();
		System.out.println("\n");
		System.out.println("Special Cookie");
		sweetCookie.show();
		System.out.println("\n");
		System.out.println("Special Pie");
		sweetPie.show();



	}
}