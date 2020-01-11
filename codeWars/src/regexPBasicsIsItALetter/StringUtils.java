package regexPBasicsIsItALetter;

import java.util.regex.*;

public class StringUtils {
	
	  public static boolean isLetter(String s) {
		    // your code goes here
		  
		  String pattern = "^[a-zA-Z]*$";
		  
		  Pattern regex = Pattern.compile(pattern);
		  
		  Matcher matcher = regex.matcher(s);
		  
		  	return ((s != null)
		  			&& (!s.equals(""))
		  			&& (s.matches(s))
		  			&& (s.matches(pattern)));
		  	
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isLetter("abcdefghijklmnopqrstuvwxyz1"));
		

	}

}
