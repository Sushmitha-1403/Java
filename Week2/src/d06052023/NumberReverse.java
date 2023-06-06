package d06052023;
import java.util.*;

public class NumberReverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		int rev=0;
		for(int temp=0;num!=0;num/=10)
		{
			temp=num%10;
			rev=(rev*10)+temp;
			
		}
		System.out.println("Reversed:"+rev);
		
		
	}

}
