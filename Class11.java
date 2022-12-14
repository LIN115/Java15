package Java15;
class CTest8 extends Thread implements Runnable {
	private String id;
	private int sec;

	public CTest8(String str, int s) {
		id = str;
		sec = s;
	}


	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				sleep(sec);
			} catch (InterruptedException e) {}
			System.out.println(id + " " + i);
		}
	}
}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest8 hi = new CTest8("Hello",1000);
		CTest8 bye = new CTest8("Good bye",2500);
		Thread t1=new Thread(hi);
		Thread t2 = new Thread(bye);
		t1.start();
		t2.start();
	}

}
