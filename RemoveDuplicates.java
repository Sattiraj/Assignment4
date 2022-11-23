import java.util.*;
class RemoveDuplicates
{
	public static void main(String[] args)
	{
		String s1=" satti raju yerramsetti";
		System.out.println("String is ::  "+s1);
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a String : ");
		//String s1=scan.nextLine();
		System.out.println("Old  String is ::  "+s1);
		System.out.println("New  String is ::  "+remove(s1));
	}
	public static String remove(String s1)
	{
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1)
			{
				s2+=ch;
			}
		}
		return s2;
	}
}