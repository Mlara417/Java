package commandPattern;

public class MakePie implements Order {
	private Pastry myPastry;
	
	public MakePie(Pastry myPastry){
		this.myPastry = myPastry;
	}
	
	public void bake() {
		myPastry.pie();
	}

}
