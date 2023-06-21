package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1=sc.nextLine();
		System.out.println("Enter the String2:");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
		
			char[] str1arr= str1.toCharArray();
			char[] str2arr= str2.toCharArray();
		
			Arrays.sort(str1arr);
			Arrays.sort(str2arr);
		
			if(Arrays.equals(str1arr,str2arr)) {
			
				System.out.println("The given strings "+str1+" and "+str2+" are anagrams");
			}
			else
			{
				System.out.println("The given strings "+str1+" and "+str2+"are not anagrams");
			}
		}
		else
		{
			System.out.println("The given strings "+str1+" and "+str2+" are not anagrams");
		}
		
		
	}

}
