package threads;

public class SecondThread extends Thread{
	public void run() {
		for(int i=201;i<=300;i++) {
			System.out.println(i);
		}
	}

}
