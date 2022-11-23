import java.util.*;
public class UniqueChar {
	boolean uniqueCharacters(String str)
	{
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		for (int i = 0; i < chArray.length - 1; i++) {
			if (chArray[i] != chArray[i + 1])
				continue;
			else
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		UniqueChar obj = new UniqueChar();
		String input ="Raju's Mobile";
		System.out.println(input);
		if (obj.uniqueCharacters(input))
			System.out.println("The String is [ " + input+ " ] has all unique characters");
		else
			System.out.println("The String is [ " + input+ " ] has duplicate characters");
	}
}