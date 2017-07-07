import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)
	{
		Queue<String> queue = new AQueue<String>(100);
		Stack<String> stack = new AStack<String>(100);
		
		String input = "Oranges Apples Bananas Dragonfruites Strawberries Peaches Melons Pears Apricots Watermelons";
		StringTokenizer str = new StringTokenizer(input);
		while(str.hasMoreTokens())
		{
			queue.enqueue(str.nextToken());
		}
		
		System.out.println("queue "+ queue);
		
		while(queue.length() != 0)
		{
			stack.push(queue.dequeue());
		}
		
		System.out.println("stack "+stack);
		
		while(stack.length() != 0)
		{
			queue.enqueue(stack.pop());
		}
		System.out.println(queue);
	}

}
