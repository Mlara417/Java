package removeStringSpaces;

public class Kata {
	
    static String noSpace(String x) {
        
    	return x.replaceAll(" " , "");
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(noSpace("hello there"));

	}

}
