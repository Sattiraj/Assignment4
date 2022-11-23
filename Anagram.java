import java.util.Scanner;
public class Anagram
{
	public static void main(String[] args)
	{
		String s1="SatTi RajU YerrAmsetTi";
		System.out.println(" The First String is : "+s1);
		String s2="yuJaR erramsetti IttAs";
		System.out.println(" The second String is : "+s2);
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter the second String : ");
		String s2 = scanner.nextLine();*/

		if (checkAnagram(s1, s2))
			System.out.println("[ "+s1 + " and " + s2 + " ] \nThese Both Strings are Anagrams");
		else
			System.out.println("[ "+s1 + " and " + s2 + " ]  \nThese Both Strings are NOT Anagrams");
		//scanner.close();
	}

	public static boolean checkAnagram(String s1, String s2)
	{
		s1 = s1.replaceAll(" ", "").toLowerCase();
		s2 = s2.replaceAll(" ", "").toLowerCase();
		if (s1.length() != s2.length())
			return false;
		else
		{
			for (int i = 0; i < s1.length(); i++)
			{
				for (int j = 0; j < s2.length(); j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
				}
			}

			if (s2.length() == 0)
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
	}
}
