package June5;

public class ThreadingExample extends Thread {
	public void run() {
		System.out.println("Thread Status: "+ Thread.currentThread().getState());
		System.out.println("Thread Alive: "+ Thread.currentThread().isAlive());
		System.out.println("Thread id: "+ Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		
		ThreadingExample t1= new ThreadingExample();
		ThreadingExample t2= new ThreadingExample();
		ThreadingExample t3= new ThreadingExample();
		ThreadingExample t4= new ThreadingExample();
		
		t1.setName("Python");
		t2.setName("Java");
		t3.setName("C++");
		t4.setName("golang");
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t4.setPriority(MIN_PRIORITY);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
