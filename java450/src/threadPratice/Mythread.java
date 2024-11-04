package threadPratice;

public class Mythread {
	public static void main(String[] args) {
		Thread th = new Thread("My thread");
		th.start();
		String st = th.getName();
		System.out.println(st);
	}
}
