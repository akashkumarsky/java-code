package threadPratice;

public class Demo2 implements Runnable {
	
	public void run() {
		System.out.println("demo2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d2 = new Demo2();
		Thread th = new Thread(d2);
		th.start();
	}

}
