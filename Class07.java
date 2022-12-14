package Java15;

class CTest4 implements Runnable {
	private String id;

	public CTest4(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 100000000; j++)
				;
			System.out.println(id + " " + i);
		}
	}
}

public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest4 hi = new CTest4("Hello");
		CTest4 bye = new CTest4("Good bye");
		CTest4 morning = new CTest4("Good morning");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		t1.start();
		t2.start();
		t3.start();
	}

}
