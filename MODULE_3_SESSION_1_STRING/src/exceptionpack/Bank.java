package exceptionpack;

public class Bank {
	
   double balance = 0;
   
   void deposite(double amount)throws ArithmeticException {
	   if(amount >= 500) {
		   balance = balance+amount;
	   }else {
		   throw new ArithmeticException("invalid amount");
	   }
   }
   
   void withdraw(double amount,String pin)throws ArithmeticException,IllegalArgumentException {
	   if(pin.length() != 4) {
		   throw new IllegalArgumentException("invalid pin");
	   }else {
		   if(amount >= balance) {
			   throw new ArithmeticException("amount shoulod be above than balance ");
		   }else {
			   balance = balance - amount;  
			   System.out.println("withraw amount :"+amount);
			   System.out.println("balance :"+balance);
		   }	 
	   }
   }

	public static void main(String[] args) {
		Bank sc = new Bank();
		
		try {
		sc.deposite(700);
		sc.withdraw(200,"892");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
