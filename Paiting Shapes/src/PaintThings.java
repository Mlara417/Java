import java.text.DecimalFormat; 
 
public class PaintThings { 
	
	public static void main (String[] args) { 
		final double coverage = 350; 
		Paint paint = new Paint(coverage); 
		
		Rectangle deck; 
		Sphere bigBall; 
		Cylinder tank; 
 
		double deckAmount, ballAmount, tankAmount; 
 
		deck = new Rectangle("Deck", 20, 35);
		bigBall = new Sphere(15);
		tank = new Cylinder("Tank", 30, 10);
 
		deckAmount = paint.amount(deck);
		ballAmount = paint.amount(bigBall);
		tankAmount = paint.amount(tank);
 
		DecimalFormat fmt = new DecimalFormat("0.#\n"); 
		System.out.println ("Number of gallons of paint needed...\n"); 
		System.out.println ("Deck " + fmt.format(deckAmount)); 
		System.out.println ("Big Ball " + fmt.format(ballAmount)); 
		System.out.println ("Tank " + fmt.format(tankAmount)); 
   } 
}
