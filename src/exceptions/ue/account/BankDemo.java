package exceptions.ue.account;

import java.util.HashMap;

import javax.security.auth.login.AccountNotFoundException;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		
		try {
			bank.addAccount("Steve", 1000, 1000);
			bank.addAccount("Melanie", 500, 500);
			System.out.println(bank);
			
			bank.transfer("Steve", "Melanie", 500);
			
			
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println(bank);
		}
		
		
		
		
		
	}

}
