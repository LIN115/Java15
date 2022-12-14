package Java15;

class CTest6 extends Thread implements Runnable {
	private String id;
	private int sec;

	public CTest6(String str, int s) {
		id = str;
		sec = s;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(sec);
			} catch (InterruptedException e) {}
				System.out.println(id + " is running..");
			}
		}
	}


public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest6 one = new CTest6("Thread 1", 1000);
		CTest6 two = new CTest6("Thread 2", 2500);
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		t1.start();
		t2.start();
	}

}
