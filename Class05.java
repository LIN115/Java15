package Java15;

class CTest3 extends Thread {
	private String id;

	public CTest3(String str) {
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

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest3 hi = new CTest3("Hello");
		CTest3 bye = new CTest3("Good bye");
		CTest3 morning = new CTest3("Good morning");
		CTest3 night = new CTest3("Good night");
		hi.start();
		bye.start();
		morning.start();
		night.start();
	}

}
