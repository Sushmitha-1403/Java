package d06162023;


import java.util.stream.Stream;

public class VowelCount {
	
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
		
		st.forEach(word -> {
            long vowelCount = word.chars()
                    .filter(c -> "AEIOU".indexOf(Character.toUpperCase(c)) >= 0)
                    .count();
            System.out.println(word + ": " + vowelCount);
        });
		
	}

}
