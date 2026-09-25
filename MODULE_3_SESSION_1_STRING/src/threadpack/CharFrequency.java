package threadpack;

public class CharFrequency {

	public static void main(String[] args) {
		String  s = "Malayalam";
		char ch = 'a';
		int count = 0;
		
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("frequeny of "+ch+" is "+count);

	}

}
