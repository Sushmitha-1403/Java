package d06022023;

interface Employer{
	abstract String employerName();
}
interface Employees{
	abstract int getEmployeesCount();
}

public class DemoInterface implements Employer, Employees{
	public String employerName() {
		return "Nano Mindz";
	}
	public int getEmployeesCount() {
		return 880;
	}
public static void main (String args[]) {
	DemoInterface inf = new DemoInterface();
	System.out.println("Employer Name:"+inf.employerName());
	System.out.println("Employee Count:"+inf.getEmployeesCount());
	
}
}
