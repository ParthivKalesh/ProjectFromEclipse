package collectionpack;

interface Checking{
	String reverse(String s);
}

public class ReverseLambda {

	public static void main(String[] args) {
		

        Checking sc = (s) -> {
            String reversed = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            return reversed;
        };
			System.out.println(sc.reverse("parthiv"));

	}

}
