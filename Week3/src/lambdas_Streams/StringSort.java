package lambdas_Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StringSort {
	
	public static void main(String args[]) {
		Stream<String> st=Stream.of("Serendipity",
				"Quixotic",
				"Mellifluous",
				"Bucolic",
				"Effervescent",
				"Labyrinthine",
				"Epiphany",
				"Zephyr",
				"Ephemeral",
				"Cascade");
		
		st.sorted(Comparator.comparingInt(String::length))
			.forEach(word->System.out.println(word+":"+word.length()));
		

}
}