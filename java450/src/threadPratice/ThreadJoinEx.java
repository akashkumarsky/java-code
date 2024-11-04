package threadPratice;

class Demo extends Thread{
	public void run() {
		for(int i =0;i<=5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("current thread name: "+Thread.currentThread().getName());
				
			}catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
}

public class ThreadJoinEx {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.start();
		try {
			System.out.println("current thread name: "+Thread.currentThread().getName());
			d1.join(1500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		d2.start();
		
		
		d3.start();
		
	}
}
