package threaddd;

import java.util.Iterator;

class Long1 {
	synchronized public static void long1() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Kagadada Doniyalii ");
		}
	}
}
 class Long2{
	 
	

	synchronized public static void long2() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Musanje Hottinalli  ");
		}
	}
}
 
class Thread1 extends Thread {
	public void run() {
		Long1.long1();

	}
}
class Thread2 extends Thread {
	public void run() {
		Long2.long2();

	}
}

public class Main1 {
	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}
}
