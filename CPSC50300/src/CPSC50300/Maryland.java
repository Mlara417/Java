package CPSC50300;

public class Maryland extends State {
	Maryland() { /* null constructor */ }
	
	public void printMe() { 
		
		System.out.println("Read it.");
		
	} 
	public static void main(String[] args) {
		Region east = new State(); 
		State md = new Maryland(); 
		Object obj = new Place(); 
		Place usa = new Region();
		
		md.printMe();
		east.printMe();
		((Place) obj).printMe();
		md.printMe();
		usa.printMe();
		md.printMe();
		
		} 
	
	
	
	}
class State extends Region { 
	State() { /* null constructor */ }
	
	public void printMe() { 
		System.out.println("Ship it."); 
		} 
	}
class Region extends Place { 
	Region() { /* null constructor */ }
	
	public void printMe() { 
		
		System.out.println("Box it."); 
		
	} 
	}
class Place extends Object { 
	Place() { /* null constructor */ }
	
	public void printMe() { 
		
		System.out.println("Buy it."); 
		} 
	}
