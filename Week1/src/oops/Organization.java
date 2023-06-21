package oops;

abstract class Department {
	abstract int getDepartmentSize();

}
class Organization extends Department{
	int getDepartmentSize() {
		return 999;
	}
	public static void main (String args[]) {
		Department size = new Organization();
		
		System.out.println("Department Size:"+size.getDepartmentSize());
	}
	
}