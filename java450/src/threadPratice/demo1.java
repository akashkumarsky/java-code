package threadPratice;

public class demo1 extends Thread {

	public void run() {
		System.out.print("demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 dm = new demo1();
		dm.start();
	}

}
