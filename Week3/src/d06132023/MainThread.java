package d06132023;

public class MainThread {
	public static void main(String args[]) {
		FirstThread ft =new FirstThread();
		SecondThread st=new SecondThread();
		
		ft.start();
		st.start();
		
		
		
	}

}
