package oops;

public class Student {
	private String name;
	public String Lastname;
	
	public void setName(String s) {
		this.name=s;
	}
	public String getName() {
		return name;
	}
public static void main (String args[]) {
	Student stu=new Student();
	stu.Lastname="Simmala";
	stu.setName("Sushmita");
	System.out.println(stu.getName()+" "+stu.Lastname);
}

}
