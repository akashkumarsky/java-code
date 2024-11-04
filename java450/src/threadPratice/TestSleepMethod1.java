package threadPratice;

public class TestSleepMethod1 extends Thread {
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSleepMethod1 tm1 = new TestSleepMethod1();
		TestSleepMethod1 tm2 = new TestSleepMethod1();
		tm1.start();
		tm2.start();

	}

}
