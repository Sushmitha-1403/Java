package d06072023;

public class StringReverse {
	public static void main (String args[]) {
		StringBuilder sb=new StringBuilder();
		String input="Java J2EE Reverse Me";
		String[] words=input.split(" ");
		String revWords="";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revWords=revWords+revword+" ";
	
		}
		System.out.println(revWords);
	}

}
