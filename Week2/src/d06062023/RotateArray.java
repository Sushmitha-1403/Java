package d06062023;

public class RotateArray {
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int size=arr.length;
		int n=2;
		for (int i=0;i<n;i++) {
			int j,first;
			first=arr[0];
			for(j=0;j<size-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
