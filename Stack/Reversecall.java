import java.util.*;
import java.io.*;
public class Reversecall {
	public static void main(String[] args) throws FileNotFoundException  {
		String str = "";
		File file = new File("file.txt");
		Scanner readfile = new Scanner(file);
		Stack<String> stack = new LStack<String>();
		while(readfile.hasNext())
		{
			str = readfile.next();
			stack.push(str);
		}
		while(stack.length() != 0)
		{
			System.out.println(stack.pop());
		}
		readfile.close();
	}
}
