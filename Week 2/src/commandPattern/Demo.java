package commandPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pastry myPastry = new Pastry();
		
		MakeCookie makeCookieOrder = new MakeCookie(myPastry);
		MakePie makePieOrder = new MakePie(myPastry);
		
		Host host = new Host();
		host.takeOrder(makeCookieOrder);
		host.takeOrder(makePieOrder);
		
		host.placeOrders();

	}

}
