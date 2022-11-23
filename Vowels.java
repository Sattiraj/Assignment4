import java.util.*;
class Vowels
{
	public static void main(String[] args)
	{
		String s1="#@@ satti raju yerramsetti 2001 @@#";
		System.out.println("String is ::  "+s1);
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter any line of String : ");
		//String s1=scan.nextLine();
		int v=0,c=0,n=0,sp=0,special=0;
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					v++;
				else
					c++;
			}
			else if(ch>='0'&&ch<='9')
				n++;
			else if(ch==' ')
				sp++;
			else
				special++;
		}
		System.out.println("Total Number Of Vowels  ::  count = "+v);
		System.out.println("Total Number Of Consonents  ::  count = "+c);
		System.out.println("Total Number Of Numbers  ::  count = "+n);
		System.out.println("Total Number Of Spaces  ::  count = "+sp);
		System.out.println("Total Number Of Special char  ::  count = "+special);
	}
}
				
				