package strings;
import java.lang.Comparable;

public class Student implements Comparable<Student>{
	private String firstname;
	private String lastname;
	private double gpa;
	
	public Student(String firstname, String lastname, double gpa)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.gpa=gpa;
	}
	
	
	public String toString() {
		return firstname+" "+lastname+ " "+gpa;
	}
	
	public int compareTo(Student o) {
		return lastname.compareTo(o.lastname);
	}

	
}
