package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExampleOne {

	public static void main(String[] args) {
		//1st way
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher = pattern.matcher("as");
		boolean flagFirst = matcher.matches();
		
		//second way
		boolean flagSecond = Pattern.compile(".s").matcher("as").matches();
				
		//third way
	    boolean flagThird = Pattern.matches(".s", "caps");
	    
	    System.out.println(flagFirst+ "\n"+flagSecond+"\n"+flagThird);

	}

}
