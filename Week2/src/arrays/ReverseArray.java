package d06062023;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int rev[]=new int[size];
		int j=0;
		
		for(int i=size-1;i>=0;i--) {
			rev[j]=arr[i];
			j++;
		}
		System.out.println("Reversed array:");
		for(int i=0;i<size;i++) {
			System.out.println(""+rev[i]);
		}
		
	}

}
