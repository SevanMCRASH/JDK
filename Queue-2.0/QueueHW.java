import java.util.*;
import java.io.*;
public class QueueHW{

	public static void main(String[] args) throws FileNotFoundException
	{
		int count = 0;
		Queue<String> queue = new AQueue<String>(100);
		Stack<String> stack = new AStack<String>(100);
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name or type QUIT to exit:");
		String filename = input.nextLine();
		File file = new File(filename);
		
		while(!file.exists())
		{
			System.out.println("Please enter the file name that exists");
			filename = input.nextLine();
			file = new File(filename);
		}
		Scanner readfile = new Scanner(file);
		readfile.useDelimiter("[ \n\t\r]+");
		String str = "";
		
		while(readfile.hasNext())
		{
			str = readfile.next();
			stack.push(str);
			queue.enqueue(str);
		}
		int foundstr = stack.length();
		System.out.println("queue "+ queue);
		System.out.println("stack "+stack);
		boolean Flag = true;
		while(Flag && queue.length() != 0)
		{
			count += 1;
			if(stack.topValue().equalsIgnoreCase(queue.dequeue()))
			{
				Flag = false;
				System.out.println(stack.topValue());
				System.out.println("Line "+ stack.length() +" (last line)");
				if (count == foundstr)
				{
					System.out.println("No match found.");
				}else 
				{
					System.out.println("Match found on line "+count+".");
				}
			}
		}
		stack.clear();
		queue.clear();
		input.close();
		readfile.close();
	}

}
