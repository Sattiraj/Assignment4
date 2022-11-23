import java.util.*;
class Duplicates
{
	public static void main(String[] args)
	{
		String s1="satti raju yerramsetti";
		System.out.println("String is ::  "+s1);
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a String : ");
		//String s1=scan.nextLine();
		int[] str=new int[127];
		for(int i=0;i<s1.length();i++)
		{
			str[s1.charAt(i)]++;
		}
		for(int i=0;i<127;i++)
		{
			if(str[i]>1)
			{
                 System.out.println("String Duplicate char is [ "+(char)(i)+" ] count = "+str[i]);
			}
		}			
	}
}
			