package conditional_operators;
import java.util.*;

public class Person {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if((age>=13)&&(age<=19)) {
			System.out.println("TEEN");
		}
		else if (age<13) {
			System.out.println("KID");
		}
		else if(age>19) {
			System.out.println("ADULT");
		}
		
	}

}
