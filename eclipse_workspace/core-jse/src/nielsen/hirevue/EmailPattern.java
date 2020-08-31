package nielsen.hirevue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {
	/**
	 * Neilson test 
	 * @param args
	 * 
	 * Question1 Email validation
	 */
	
	public static boolean isEmailValid(String email) {
		String pattern = "^[a-zA-Z0-9+_.]+@[a-z+-]+.[tld+com+org+net]+$";
	     
        Pattern patterns = Pattern.compile(pattern);
        Matcher matcher = patterns.matcher(email);
        boolean result = matcher.matches();
	         
	    return result;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Jai Ram G Ki");
		System.out.println(isEmailValid("abbcccsd"));
		System.out.println(isEmailValid("abbcccsd@cm.cc")); 
	}  
}
