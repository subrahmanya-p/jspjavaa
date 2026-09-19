package threaddd;

class Increment {
	static int count = 0;

	synchronized static void increment() {
		count++;
	}

}

class Task implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Increment.increment();
		}

	}
}

public class Main2 {
	public static void main(String[] args) throws InterruptedException {

		Task task = new Task();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Increment.count);

	}
}