import java.io.*;
import java.util.*;

public class SumRecusion {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter a number to calculate the sum or -1 to exit:");
	 int num = input.nextInt();
	 while(num != -1)
	 {
		 while(num < -1 || num == 0)
		 {
			 System.out.println("Invalid number. The entry should be a positive number.");
			 System.out.println("Please enter a number to calculate the sum or -1 to exit:");
			 num = input.nextInt();
		 }
		 int sum = SumReusion(num);
		 System.out.println("The sum of first "+ num +" natural numbers is " + sum + ".");
		 System.out.println("Please enter a number to calculate the sum or -1 to exit:");
		 num = input.nextInt();
	 }
	}
	public static int SumReusion(int num)
	{
		if(num == 0)
		{
			return num;
		}
		else
		{
			return num + SumReusion(num - 1);
		}
	}
}
