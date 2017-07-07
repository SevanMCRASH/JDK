import java.util.*;
import java.io.*;
public class WordCount {

	public static void main(String[] args) throws FileNotFoundException 
	{
		 int count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name or type QUIT to exit:");
		String filename = input.nextLine();
		File file = new File(filename);
		
		if(!filename.equalsIgnoreCase("quit"))
		{
			while(!file.exists() && !filename.equalsIgnoreCase("quit"))
			{
				System.out.println("File: "+ filename + " does not exist.");
				System.out.println("Please enter the file name again or type QUIT to exit:");
				filename = input.nextLine();
				file = new File(filename);
				if(filename.equalsIgnoreCase("quit"))
				{
					return;
				}
			}
			
			Scanner readfile = new Scanner(file);
	
			while(readfile.hasNext())
				 {
				     readfile.next();
				     count++;
				 }
			System.out.println("Total number of words: " + count);
			readfile.close();	
		}
		else
		{
			System.out.print("");
		}
		
		
		input.close();
	}

}
