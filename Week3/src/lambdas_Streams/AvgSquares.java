package lambdas_Streams;

import java.util.stream.Stream;

public class AvgSquares {

public static void main(String args[]) {
	Stream<Integer> st=Stream.of(7,2,10,11,9);
	
	System.out.println("Displaying the squares of each number:");
	st.map(num->num*num)
		.forEach(System.out::println);
	
	Stream<Integer> add=Stream.of(7,2,10,11,9);
	long sum=add.mapToInt(num->num*num)
			.sum();
	
	Stream<Integer> sumavg=Stream.of(7,2,10,11,9);
	long size= sumavg.count();
	long avg=sum/size;
	
	System.out.println("Sum of the Squares:"+sum);
	System.out.println("Average of the sum of sqares:"+avg);
	
	
}
}
