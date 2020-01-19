package decoratorPattern;

public class SweetDessertDecorator extends DessertsDecorator {
	public SweetDessertDecorator(Desserts decoratedDessert) {
		super(decoratedDessert);
	}

	@Override
	public void show(){
		decoratedDessert.show();
		setSweetTopping(decoratedDessert);
	}

	private void setSweetTopping(Desserts decoratedDessert) {
		System.out.print("with sugar");
	}
}