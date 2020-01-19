package decoratorPattern;

public abstract class DessertsDecorator implements Desserts {
	protected Desserts decoratedDessert;

	public DessertsDecorator(Desserts decoratedDessert) {
		this.decoratedDessert = decoratedDessert;
	}

	public void show(){
		decoratedDessert.show();
	}
}