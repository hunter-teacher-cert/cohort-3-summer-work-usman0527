 //Collaborators: Usman Ahmed, Ben Eckley, Sam Lojacono, and Kirk Martin

import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	//System.out.println(ss);
  //ss = new SortSearch(); //testing undefined length
  //System.out.println(ss);
	
		
	// Uncomment these to test part 2

	// int i;
	// i = ss.findSmallestIndex(0);
	// System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	// i = ss.findSmallestIndex(3);
	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	 System.out.println(ss);
	 ss.sort();
  System.out.println(ss);

  // System.out.println("testing linear search");
  // System.out.println(ss.linearSearch(10));
  // System.out.println(ss.linearSearch(19)); //should print 7
  // System.out.println(ss.linearSearch(13));

      System.out.println(ss.binarySearch(10));

      ArrayList<Integer> a= ss.buildIncreasingList(20);
	    System.out.println(a);

	// build a second Arralist here
	    ArrayList<Integer> b = ss.buildIncreasingList(15);

      ArrayList<Integer> list1= ss.buildIncreasingList(5);
	    System.out.println(list1);
	

    	// build a second Arralist here
    	ArrayList<Integer> list2= ss.buildIncreasingList(15);
    	System.out.println(list2);
    
    	ArrayList<Integer> result = ss.merge(list1,list2);
    	System.out.println(result);

      ArrayList<Integer> data = new ArrayList<Integer>();
      Random  r = new Random();
	    for (int i=0;i<15;i++)
      {  
	      data.add(r.nextInt(20));
	    }
      System.out.println(data);  
      System.out.println(ss.mergeSort(data));
    	// test your merge routine here

	      

  }
}