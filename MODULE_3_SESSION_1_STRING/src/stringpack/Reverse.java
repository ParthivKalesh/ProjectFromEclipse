package stringpack;

public class Reverse {

	public static void main(String[] args) {
		String name = "parthiv";
		char[] arr = new char[7];
		int count = 0;
		for(int i = name.length()-1;i>=0;i--) {
			arr[count] = name.charAt(i) ;
			count++;
		}
		for(char nam:arr) {
			System.out.print(nam);
		}
	}

}
