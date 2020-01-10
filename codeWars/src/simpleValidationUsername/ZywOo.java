package simpleValidationUsername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZywOo {
	  public static boolean validateUsr(String s) {
		  
		  
		  Pattern pattern = Pattern.compile("[a-z0-9_]+");
		  
		  boolean valid = (s != null) && pattern.matcher(s).matches(); 
		  
	    return valid;
	  }
	  
	  public static void main(String[] args) {
		  
		  System.out.println(validateUsr("john"));
		  
	  }
	  
	}
