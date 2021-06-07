package June5;

class MyThread extends Thread{
	 public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println("learning java" + Thread.currentThread().getId());
			}
		} catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class YourThread extends Thread{
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println("We are into Phase1   "+ Thread.currentThread().getId());
			}
		} catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class Threading  {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		YourThread t2= new YourThread();
		t1.start();
		t2.start();
		

	}

}
