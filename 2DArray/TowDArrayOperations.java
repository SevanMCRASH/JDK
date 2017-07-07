import java.util.*; 
import java.io.*;
public class TowDArrayOperations {

	public static void main(String[] args)throws FileNotFoundException
	{
		System.out.println("Please enter the file name: ");
		double [][] array = loadArray(args[0]);
	for(int row = 0; row < array.length; row++)
		{
			double total = getRowTotal(array,row);
			System.out.println(total);
		}
		for(int col = 0; col< array[0].length; col++)
		{
			double total = getColTotal(array,col);
			System.out.println(total);
		}
		System.out.println("Total: "+ grandTotal(array));
	}
	
	public static double grandTotal(double[][] array)
	{
		double grandtotal = 0;
		for( int i = 0; i < array.length; i++)
		{
			for( int j = 0; j < array[0].length; j++)
			{
				grandtotal += array[i][j];
			}
		}
		return grandtotal;
	}
	
	public static double getRowTotal(double[][] array, int rowNumber)
	{
		double total = 0;
		for( int i = 0; i < array[rowNumber].length; i++)
		{
			total += array[rowNumber][i];
		}
		return total;
	}
	
	public static double getColTotal(double[][] array, int colNumber)
	{
		double total = 0;
		for( int i = 0; i < array.length; i++)
		{
			total += array[i][colNumber];
		}
		return total;
	}
	
	
	
	public static double[][]loadArray(String filename)throws FileNotFoundException
		{
			Scanner input = new Scanner(new File(filename));
			int lineCount = 0;
			int colCount = 0;
			while(input.hasNext())
			{
				String line = input.nextLine();
				if(line.split(" ").length > colCount)
					colCount = line.split(" ").length;
				lineCount++;
			}
			input.close();
			double[][] result = new double[lineCount][colCount];
			
			input = new Scanner(new File(filename));
			for(int row = 0; row < lineCount; row++)
			{
				for(int col = 0; col < colCount; col++)
				{
					result[row][col] = input.nextDouble();
				}
			}
			input.close();
			return result;
		}
}
