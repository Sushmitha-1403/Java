package Day4;

class Test{
	static int i;
	static int display() {
		return i;
	}
	static {
		System.out.println("Calling Static Block");
		i=100;
		//display();
		
	}
}

public class DemoStatic {
	public static void main (String args[]) {
	System.out.println("Initializing variable and returning the value:"+Test.display());
	//Final Class implementation
	DemoFinal obj = new DemoFinal();
	System.out.println("variable value declared as final:"+obj.display());
	}

}
