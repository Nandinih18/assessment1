package wallet.ui;

import wallet.entity.*;

public class WalletMain {
	public static void main(String[] args) {
		WalletEntity[] store = new WalletEntity[3];
		store[0] = new WalletEntity("1234567890", "Nandini", 1000);
		store[1] = new WalletEntity("2345678901", "Nida", 1000);
		store[2] = new WalletEntity("1234098764", "Harika", 2000);
		
		store[1].transferAmount(store[2], 600);
		
		
		WalletMain m = new WalletMain();
		m.print(store);
	}
	
	private void print(WalletEntity[] c) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Mobile Number:" + c[i].getMobileNo() + "Name:" + c[i].getName() + "Balance:" + c[i].getBalance());
		}

}
}