package exceptionpack;

class InvalidCredentials extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
	public InvalidCredentials(String s) {
		super(s);
		this.s = s;
	}
	@Override
	public String toString() {
		return "exception caught"+s;
	}
	
}
public class UserDefinedException  {
	void validateUser(int otp) throws InvalidCredentials{
		if(otp != 1234) {
			throw new InvalidCredentials("otp miss match");
		}else {
			System.out.println("login sucess");
		}
	}
	
	void validateEmail(String email,String password) throws InvalidCredentials{
		if(!email.endsWith("@gmail.com")) {
			throw new InvalidCredentials("email not correct");
		}else {
			if(password.length() < 5) {
				System.out.println("email is correct and password length is ok");
			}else {
				throw new InvalidCredentials("invalid password length");
			}
		}
	}
	public static void main(String[] args) throws InvalidCredentials {
		UserDefinedException sc = new UserDefinedException();
		sc.validateUser(1234);
		sc.validateEmail("parthivkalesh@gmail.com", "1278");

	}

}
