package d06072023;


import java.io.*;
import java.util.*;

public class FileRead {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\simma\\git\\repository\\Week2\\src\\d06072023\\Student.csv"));
		ArrayList<Student> student=new ArrayList<>();
		String currentLine;
		while((currentLine=br.readLine())!=null) {
			String[] content=currentLine.split(",");
			if(content[0].equals("\"\""))
				continue;
			String firstname = content[0].trim();
            String lastname = content[1].trim();
            
            
            double gpa;
            try {
                gpa = Double.parseDouble(content[2].trim());
            } catch (NumberFormatException e) {
                continue;
            }
            
            
			student.add(new Student(firstname,lastname,gpa));
			
		}
		Collections.sort(student);
		 for (int i = 0; i < student.size(); i++) {
	            System.out.println(student.get(i));
	        }
		
	}

}
