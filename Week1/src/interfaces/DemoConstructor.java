package interfaces;
 class Add{
	 int a;
	
 }
class Mul extends Add{
	int b;

	public Mul(int a, int b) {
		super.a=a;
		this.b=b;
		
	}
	public Mul(int b) {
		this.b=b;
		
	}
	
}
public class DemoConstructor {
	public static void main (String args[])
	{
	Mul obj=new Mul(2);
	Mul obj1=new Mul(2,6);
	System.out.println("feild from child class and representing an overloaded constructor: "+obj.b);
	System.out.println("feild from parent and child class using superkeyword: "+obj1.a+obj1.b);
	
	}


}
