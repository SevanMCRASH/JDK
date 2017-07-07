import java.util.*;
import java.io.*;

public class PhoneBook {
	
	public static void main(String[] args) throws FileNotFoundException {	
		ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
		
		File file = new File("phonebook.csv");
		Scanner fileName = new Scanner(file);
		fileName.useDelimiter("[,\n\r\t]+");
				
		while (fileName.hasNext()){					
			String fname =  fileName.next();
			String Lname =  fileName.next();
			String phone = fileName.next();						
			phoneBook.add(new PhoneBookEntry(fname,Lname,phone));
		}			
			
		Scanner input = new Scanner(System.in);
		String userInput;
		char userSelection;
		
		do {
			System.out.println("Phone Book");
			System.out.println("==========");
			System.out.println("1. Find an entry");
			System.out.println("2. Add a new entry");
			System.out.println("3. Remove an entry");
			System.out.println("4. Display all");
			System.out.println("5. Exit");
			
			userInput = input.nextLine();
			userSelection = userInput.charAt(0);
						
			if ( userSelection == '1')
			{
				findEntry(phoneBook,input);
			}
				
			else if( userSelection == '2')
			{
				addNewEntry(phoneBook,input);			
			}
			
			else if( userSelection == '3')
			{			
				removeRecord(phoneBook,input);			
			}
			
			else if( userSelection == '4')
			{
				showAllRecords(phoneBook);		
			}
			
			else if( userSelection != '5') 
			{
				System.out.println("Invalid Selection!");
			}	
		
			saveRecordsToFile(phoneBook);
			
		} while ( userSelection != '5');		

				
		System.out.println("Program has been treminated");
		System.exit(0);
				
		input.close();		
		fileName.close();		
	}	
	
	public static void findEntry(ArrayList<PhoneBookEntry> phoneBook, Scanner input)
	{
		boolean flag = false;
		String userInput;
	
		System.out.println("Please type the name, Last Name or Phone Number");
		userInput = input.nextLine();
		
		for (int i=0; i < phoneBook.size(); i++)
		{
			if (phoneBook.get(i).getFirstName().equalsIgnoreCase(userInput))//checks to see if input name = line name
			{				
				printFindedEntry(i,phoneBook);
				flag = true;
			}	
			
			if (phoneBook.get(i).getLastName().equalsIgnoreCase(userInput))
			{
				printFindedEntry(i,phoneBook);
				flag = true;
			}
			
			if (phoneBook.get(i).getPhoneNumber().equalsIgnoreCase(userInput))
			{
				printFindedEntry(i,phoneBook);
				flag = true;
			}			
		}	
		
		if (flag == false) 
		{
			System.out.println("No data found\n");						
		}			
		
	}
	
	public static void printFindedEntry(int index, ArrayList<PhoneBookEntry> phoneBook)
	{
		System.out.println("ID: "+ (index+1) );
		System.out.println("First Name: " + phoneBook.get(index).getFirstName());
		System.out.println("Last Name: " + phoneBook.get(index).getLastName());
		System.out.println("Phone Number: " + phoneBook.get(index).getPhoneNumber() + "\n");
	}
		
	public static void addNewEntry(ArrayList<PhoneBookEntry> phoneBook, Scanner input)
	{
		System.out.println("Please type the First Name?");		
		String fname =  input.nextLine();
		System.out.println("Please type the Last Name?");	
		String Lname =  input.nextLine();
		System.out.println("Please type the Phone Number?");
		String phone = input.nextLine();					
		phoneBook.add(new PhoneBookEntry(fname,Lname,phone));		
	}
	
	public static void removeRecord (ArrayList<PhoneBookEntry> phoneBook, Scanner keyboard){
		int idNumber;				
		System.out.println("Please type the Id number to delete?");							
		idNumber = Integer.parseInt(keyboard.nextLine());			
		--idNumber;
		
		if (idNumber >= 0 && idNumber <= phoneBook.size()-1)
		{
			System.out.println(phoneBook.get(idNumber).getFirstName() + " " + phoneBook.get(idNumber).getLastName() + " " + phoneBook.get(idNumber).getPhoneNumber());	
			phoneBook.remove(idNumber);
			System.out.println("Entry Deleted.");					
		}
		
		else
		{
			System.out.println("Id does not Exists\n");					
		}		
	}

	public static void showAllRecords(ArrayList<PhoneBookEntry> phoneBook)
	{
		for (int i = 0; i < phoneBook.size(); i++)
		{
			System.out.println("ID: "+ (i+1) );
			System.out.println("First Name: " + phoneBook.get(i).getFirstName());
			System.out.println("Last Name: " + phoneBook.get(i).getLastName());
			System.out.println("Phone Number: " + phoneBook.get(i).getPhoneNumber() + "\n");
		}		
	}
	
	public static void saveRecordsToFile(ArrayList<PhoneBookEntry> phoneBook) throws FileNotFoundException
	{
		PrintWriter outputFile = new PrintWriter("phonebook.csv");
		for (int i = 0; i < phoneBook.size(); i++){
			outputFile.print(phoneBook.get(i).getFirstName() + ",");
			outputFile.print(phoneBook.get(i).getLastName() + ",");
			outputFile.println(phoneBook.get(i).getPhoneNumber());
		}				
		outputFile.close();	
	}
	

}
