package exceptions.ue.account;

public class Account {

	
	private String owner;
	private double balance;
	private double overdraftFrame;
	
	
	
	public Account(String owner, double balance, double overdraftFrame) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.overdraftFrame = overdraftFrame;
	}

	public void load(double amount){
		balance += amount;
	}
	
	public void credit(double amount) throws NotEnoughMoneyException{
		
		if(balance + overdraftFrame > amount){
				balance -= amount;
		}
		else
			throw new NotEnoughMoneyException();
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getOverdraftFrame() {
		return overdraftFrame;
	}
	public void setOverdraftFrame(double overdraftFrame) {
		this.overdraftFrame = overdraftFrame;
	}
	
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", overdraftFrame=" + overdraftFrame + "]";
	}
	
	
	
}
