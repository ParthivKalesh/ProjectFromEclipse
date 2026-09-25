package threadpack;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String word1 = "slient";
		String word2 = "listen";
		
		char[] a1 = word1.toCharArray();
		char[] a2 = word2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("its anagram");
		}else {
			System.out.println("not anagram");
		}
		

	}

}
