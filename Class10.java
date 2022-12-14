package Java15;

class CTest7 implements Runnable {
	private String id;

	public CTest7(String str) {
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

public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest7 hi = new CTest7("Hello");
		CTest7 bye = new CTest7("Good bye");
		CTest7 morning = new CTest7("Good morning");
		CTest7 night = new CTest7("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
