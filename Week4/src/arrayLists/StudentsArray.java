package arrayLists;
import java.util.*;

public class StudentsArray {

    private String firstName;
    private String lastName;
    private double gpa;

    public StudentsArray(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}

 