package strings;

public class CheckRotation {
	public static void main (String args[]) {
		String str1="JavaJ2eeStrutsHibernate";
		String str2="StrutsHibernateJavaJ2ee";
		
		if(str1.length()==str2.length())
		{
			String temp=str1+str1;
			if(temp.indexOf(str2)!=-1)
			{
				System.out.println("true");
				
			}
			else
			{
				System.out.println("false");
			}
		}
		else System.out.println("false");
			
			
	}

}
