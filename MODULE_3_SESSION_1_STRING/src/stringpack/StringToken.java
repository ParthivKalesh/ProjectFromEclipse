package stringpack;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Luminar technolab kakkanad kochi");
	while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		}
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());

	}

}
