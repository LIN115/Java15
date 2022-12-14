package Java15;

class CTest9 implements Runnable {
	private String id;

	public CTest9(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (2000 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}
	}
}

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest9 hi = new CTest9("Hello");
		CTest9 bye = new CTest9("Good bye");
		CTest9 morning = new CTest9("Good morning");
		CTest9 night = new CTest9("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		try {
			t1.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("All Threads sre finished");
	}

}
