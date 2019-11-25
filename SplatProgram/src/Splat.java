import javax.swing.*;
import java.awt.*;
import java.util.Scanner; 

public class Splat {

	public static void main(String[] args) {
		
		int size;
		int x;
		int y;
		String color;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size: ");
		size = scan.nextInt();
		
		System.out.println("Enter upper x limit: ");
		x = scan.nextInt();
		
		System.out.println("Enter upper y limit: ");
		y = scan.nextInt();
		
		System.out.println("Enter color: ");
		color = scan.next();
		
		JFrame frame = new JFrame("Splat");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new SplatPanel(size, color, x, y));
		frame.pack();
		frame.setVisible(true);
		
	}

}
