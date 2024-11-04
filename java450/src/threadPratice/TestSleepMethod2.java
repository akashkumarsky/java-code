package threadPratice;

public class TestSleepMethod2 {
	public static void main(String[] args) {
		
		try {
			for(int i =0; i<=5; i++) {
				Thread.sleep(-100);
				System.out.print(i);
			}
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
		
	}
}
