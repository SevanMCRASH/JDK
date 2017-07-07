import java.io.*;
import java.util.*;
	
public class TwoLinkList {

	public static void main(String[] args) 
	
	   {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(10);
		//list2
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(5);
		list2.add(7);
	
		printOrder(list1, list2);
		
	   }
	
    public static void printOrder(List<Integer> list1, List<Integer> list2)
     {
    	ListIterator<Integer> iterator1 = list1.listIterator();
    	ListIterator<Integer> iterator2 = list2.listIterator();
    	List<Integer> list3 = new ArrayList<Integer>();
    	int num1 = iterator1.next();//first
    	int num2 = iterator2.next();//first
    	    	
		while(iterator1.hasNext() || iterator2.hasNext())
		{
			 if(num1 < num2)//if list1 smaller add
			 {
				 list3.add(num1);
				 num1 = iterator1.next();
			 }
			 else if(num1 > num2)//if list2 smaller add
			 {
				 list3.add(num2);
				 num2 = iterator2.next();
			 }
			 if(num2 == list2.get(list2.size() - 1) &&  num1 == list1.get(list1.size() - 1))
			 {
				 if(num1 < num2)//if list1 smaller add
				 {
					 list3.add(num1);
					 list3.add(num2);
				 }
				 else
				 {
					 list3.add(num2);
					 list3.add(num1);
				 }
			 }
		
    	 }
    	 System.out.println(list3);
			
		}
		
	}

	


