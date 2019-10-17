package test;

public class question9 {

	public static int question9(String a, char b, int i) {
		if (i == a.length()) { 
			return 0;
		} else if (b == a.charAt(i)) {
			return question9(a, b, i+1) + 1;
		} else {
			return question9(a, b, i+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		char b = 0;
		int i = 0;
		
		System.out.print(question9(a, b, 0));

	}

}
