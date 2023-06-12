package d06072023;
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
	
	  public String getFirstname() {
	        return firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public double getGpa() {
	        return gpa;
	    }
	
	
	public String toString() {
		return firstname+" "+lastname+ " "+gpa;
	}
	
	public int compareTo(Student o) {
		return lastname.compareTo(o.lastname);
	}

	
}
