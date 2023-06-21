package threads;

public class ImplementRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=100;i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String args[]) {
		ImplementRunnable ir=new ImplementRunnable();
		System.out.println("Implementing Runnable....");
		Thread th=new Thread(ir);
		th.start();
	}
	

}
