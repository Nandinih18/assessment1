package wallet.entity;


public class WalletEntity {
	private String mobileNo;
	private String name;
	private double balance;
	
	public WalletEntity() {
		
	}
	
	public WalletEntity(String mobileNo,String name,double balance) {
		this.mobileNo=mobileNo;
		this.name=name;
		this.balance=balance;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo=mobileNo;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void transferAmount(WalletEntity b,double amount) {
		if(balance>amount) {
			balance=balance-amount;
			b.balance=b.balance+amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}


}
