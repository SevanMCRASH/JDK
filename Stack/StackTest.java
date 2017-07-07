import java.util.*;
public class StackTest {

	public static void main(String[] args) //throws FileNotFoundException 
	{  
		/*
		String a  = null;
		String str = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name");
		String filename = input.nextLine();
		File file = new File(filename);//File only accepts files
		
		while(!file.exists())//checks to see if it exists
		{
			System.out.println("File: "+ filename + " does not exist.");
			System.out.println("Please enter the file name again");
			filename = input.nextLine();
			file = new File(filename);
		}
		
		//remember scanner read materal
		Scanner readfile = new Scanner(file);
		while(readfile.hasNext())
		 {
			str += readfile.nextLine();
		 }
		*/
		System.out.println("Please enter the file name");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String replaceString = str.replaceAll("\\s+","");
		System.out.println(replaceString);
		String secondrplace = replaceString.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(secondrplace);
		
		Stack<String> stack = new LStack<String>();
		Queue<String> queue = new LinkedList<String>();
		boolean flag = true;
		String word;
		
		for (int i = 0; i < secondrplace.length() ; i++) 
		{
			word = "" + secondrplace.charAt(i);//one by one adds each character
			queue.add(word);
			stack.push(word);//
		}
	    
		 while (!queue.isEmpty( ))//checks lines
		 {
			 if (!queue.remove().equals(stack.pop( )))//if the removal of quene is not the same as stack.pop then it is false else not
			 {
				 flag = false;
			 }      
	     }

		    if (flag == true)
		    {
		    	 System.out.println("it is a palindrome.");
		    }
		           
		    else
		    {
		    	 System.out.println("it isn't a palindrome.");
		    }
		input.close();
		//readfile.close();
	}
}
