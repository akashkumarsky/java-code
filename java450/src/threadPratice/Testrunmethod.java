package threadPratice;

public class Testrunmethod extends Thread {
	
	public void run() {
		System.out.println("run method");
	}
	
	public static void main(String[] args) {
		TestSleepMethod1 tm22 = new TestSleepMethod1();
		tm22.run();
	}
}
