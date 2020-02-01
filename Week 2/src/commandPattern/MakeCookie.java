package commandPattern;

public class MakeCookie implements Order {
	private Pastry myPastry;
	
	public MakeCookie(Pastry myPastry){
		this.myPastry = myPastry;
	}
	
	public void bake() {
		myPastry.cookie();
	}

}
