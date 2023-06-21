package lambdas_Streams;
import java.util.*;
import java.util.stream.Stream;

public class Capitalize {
	public static void main (String args[]) {
		
			Stream<String> st=Stream.of("Serendipity",
					"quixotic",
					"mellifluous",
					"Bucolic",
					"effervescent",
					"Labyrinthine",
					"epiphany",
					"zephyr",
					"ephemeral",
					"cascade");
			
		
//		st.filter(word -> word.matches("[A-Z]\\w*"))
//        .forEach(word -> {
//            char firstChar = Character.toUpperCase(word.charAt(0));
//            String capitalizedWord = firstChar + word.substring(1);
//            System.out.println(capitalizedWord);
//        });

		st.map(word -> {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String capitalizedWord = firstChar + word.substring(1);
            return capitalizedWord;
        })
        .forEach(System.out::println);
		
		
	}

}
