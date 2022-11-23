import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		int reverse=0,remainder,orginal,number=2552;
		//Scanner scn=new Scanner(System.in);
		//System.out.println("Enter a number :");
		//number=scn.nextInt();
		orginal=number;
		while(number>0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if(orginal==reverse)
		{
			System.out.println("The number "+orginal+" is a Palindrome");
		}
		else
		{
			System.out.println("The number "+orginal+" is not a Palindrome");
		}
	}
}
	