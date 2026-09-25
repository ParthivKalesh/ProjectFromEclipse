package stringpack;

public class StringBufferOrBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer(6);
		StringBuffer sb2 = new StringBuffer("hello");
//		System.out.println(sb.length());
//		sb.append("welcome to java");
//		System.out.println(sb);
	System.out.println(sb1.capacity());
		sb1.append("Lumianar kochi");
		System.out.println(sb1.capacity());
		sb2.append("world");
		System.out.println(sb2);

	}

}
