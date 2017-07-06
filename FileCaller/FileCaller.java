import java.util.*; 
import java.io.*;

public class FileCaller
{
  public static void main(String[] args) throws FileNotFoundException
  {
	  String filename;
	  Scanner inputFile = new Scanner(System.in);

	  System.out.println("Please enter the file name: ");
	  filename = inputFile.nextLine();//nextline is for string input
	  File file = new File(filename);//File = class; file = obj, cant sees string 
	  while(!file.exists())//file.exists checks to see if file exists
	  {
		  System.out.println("File \'" + filename +"\' does not exist.");
		  System.out.println("Please enter the file name again: ");
		  filename = inputFile.nextLine();
		  file = new File(filename);//java 
	  }
		
	  //it is neccssary to open two scanner obj because it needs to check if it exisit, second it reads
	  Scanner readFile = new Scanner(file);//checks to see if the obj exists cant read it
	  int size = 0;
	  double sum = 0;
		
		while(readFile.hasNext())//has next checks to see if file has a string for it to existes
		{
			double number = readFile.nextDouble();//input nextline is for string input
			sum += number;
			size++;
		}
		// functions are what read the file, not the scanner
	
		System.out.printf("Total: %,.3f\n", sum );// "\n" will take you to next line for printf
		System.out.printf("Average: %,.3f\n", sum/size);//for printf "," is replaced with "+"
		inputFile.close();
		readFile.close();
  }
}