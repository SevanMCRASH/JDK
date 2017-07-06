
public class Assignment46 {

	public static void main(String[] args) {
		
		// step 1. create a linked list
		LList<Integer> llist = new LList<>();
		LList<Integer> list2 = new LList<>();
		
		llist.append(1);
		llist.append(2);
		llist.append(5);
		llist.append(6);
		llist.append(9);
		
		list2.append(1);
		list2.append(3);
		list2.append(5);
		list2.append(8);
		list2.append(8);
		
		printLList(llist);
		
		printLList(list2);

		//llist.reverse();
		
		merge(llist, list2);
		

	}
	
	public static void printLList(LList<Integer> llist) {
		int current = llist.currPos();
		System.out.print("< ");
		for (llist.moveToStart(); llist.currPos() < llist.length(); llist.next()) {
			int it = llist.getValue();
			System.out.print(it + " ");
		}
		System.out.println(">");
		llist.moveToPos(current);
	}
	

    public static void merge(LList<Integer> llist, LList<Integer> list2)
     {
    	LList<Integer> list3 = new LList<>();
    	
    	while(llist.getValue() != null || list2.getValue() != null)
    	{
    		if(list2.getValue() == null)
    		{
    			 list3.append(llist.getValue());
    			 llist.next();
    		}
    		else if(llist.getValue() == null)
    		{
    			list3.append(list2.getValue());
   			    list2.next();
    		}
    		else if(llist.getValue() == list2.getValue())
        	{
        		 list3.append(llist.getValue());
    			 llist.next();
    			 list3.append(list2.getValue());
    			 list2.next();
        		
        	}
        	else if(llist.getValue() < list2.getValue())//if list1 smaller add
    		 {
    			 list3.append(llist.getValue());
    			 llist.next();
    		 }
    		
    		 else if(llist.getValue() > list2.getValue())//if list2 smaller add
    		 {
    			 list3.append(list2.getValue());
    			 list2.next();
    	     }
    		 
    	}
    	
    	 printLList(list3);
     }

}
