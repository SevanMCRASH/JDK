import java.util.*;
import java.io.*;
public class StringReverser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name ="";
		while(!name.equalsIgnoreCase("QUIT"))
		{
			System.out.println("Please enter a string to test for palindrome or type QUIT to exit:");
			name = scan.nextLine();
			if(!name.equalsIgnoreCase("QUIT"))
			{
				boolean flag = isPalindrome(name.toLowerCase());
				if(flag == true)
				{
					System.out.println("The input is a palindrome.");
				}
				else
				{
					System.out.println("The input is not a palindrome.");
				}
			}
			//System.out.println("Reversed string: "+reverse(name));	
				
				
		}
		scan.close();
	}
	public static String reverse(String str)
	{
		if(str.length() < 2)
		{
			return str;
		}
		else
		{
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
	public static boolean isPalindrome(String str)
	{
		 int length = str.length();
		 	if(!Character.isAlphabetic(str.charAt(0)))
		 	{
		 		return isPalindrome(str.substring(1));
		 	}
		 	
		 	if(!Character.isAlphabetic(str.charAt(str.length() -1 )))
		 	{
		 		return isPalindrome(str.substring(0, str.length() - 1));
		 	}
		 	
		    if (length < 2) //first base case
		        return true;
		    
		    else {
		        if (str.charAt(0) != str.charAt(str.length() -1))//second base case
		            return false;
		
		        else
		            return isPalindrome(str.substring(1, length - 1));
		    }
	}

}
//send in the reverse and see if the reverse characters are maching the normal version one
