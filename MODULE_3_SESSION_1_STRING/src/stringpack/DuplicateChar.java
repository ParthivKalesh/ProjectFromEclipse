package stringpack;

public class DuplicateChar {
	public static void main(String[] args) {
		String name = "malayalam";
		for(int i = 0;i < name.length();i++) {
			char str = name.charAt(i);
			
			if(name.indexOf(str) == i && name.indexOf(str) != name.lastIndexOf(str)) {
				System.out.println(str);
			}
			
		}
		
	}
}
