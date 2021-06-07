package June5;

class Customer {
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("\nInitiating new withdrawal");
		if (this.amount < amount) {
			try {
				System.out.println("Waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Withdrawal complete, amount left: " + this.amount);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("\nInitiating deposit");
		this.amount += amount;
		System.out.println("Deposit successful, amount in bank: " + this.amount);
		notify();
	}
}

public class WaitNotifyDemo {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		new Thread() {
			public void run() {
				c.withdraw(2000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(17000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();

	}

}
