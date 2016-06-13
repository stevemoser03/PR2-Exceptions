package exceptions.ue.account;

import java.util.HashMap;

import javax.security.auth.login.AccountNotFoundException;

public class Bank {

	@Override
	public String toString() {
		return "Bank [accounts=" + accounts + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	private HashMap<String,Account> accounts = new HashMap<>();
	
	public void addAccount(String owner, double balance, double overdraftFrame) throws BankException{
	
			if(accounts.containsKey(owner)){
				throw new BankException("Account für "+owner+" allready exists");
			}
			else{
				accounts.put(owner, new Account(owner, overdraftFrame, overdraftFrame) );
			}
	}
	
	public void transfer(String fromOwner, String toOwner, double amount)
							throws AccountNotFoundException, BankException{
			if(!accounts.containsKey(fromOwner) || !accounts.containsKey(toOwner)){
				throw new AccountNotFoundException("Konto nicht gefunden");
			}
			try {
					accounts.get(fromOwner).credit(amount);
					accounts.get(toOwner).load(amount);
				} catch (NotEnoughMoneyException e) {
					throw new BankException();
				}
	}
	
	
	
}
