//Collaborators: Usman Ahmed, Ben Eckley, Sam Lojacono, and Kirk Martin

import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{
    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<15;i++){
	      data.add(r.nextInt(20));
	    }
    }
    
    public SortSearch(int size){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<size;i++){
	      data.add(r.nextInt(20));
	    }  
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }
    
    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start)
      {
	      int smallIndex = start;

          for( int i = start; i < data.size(); i++)
            {
              if (data.get(i) < data.get(smallIndex))
              {
                smallIndex = i;
              }
            }
	      return smallIndex;
      }

    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
    */
    public void sort()
      {
        int temp;
        for(int i = 0; i < data.size() - 1; i++)
          {
            int smallIndex = findSmallestIndex(i); //returns smallest index from i to the end
            //give temp the data at i
            temp = data.get(i);
            //give data at i the data of the smallest index
            data.set(i, data.get(smallIndex));
            //give data the value at smallest index
            data.set(smallIndex, temp);         
          }
      }

    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
	    //go through the array list
	    for(int i =0; i < data.size()-1; i++){
        if(data.get(i)== value){
          return i; //this will stop the search at the first occurence.
        }
      }
	    return -1; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
      int high = data.size()-1;
      int low = 0;
      int middle = (high + low)/2;
      
	// while we're not done:
      //check for a cross in high and low
      //ex [1, 3, 5], search for 2
    while(low < high){
      //System.out.println("low: " + low + " middle: "+ middle + " high: " + high);
      //   if the item is at data.get(middle), return middle
	     if(data.get(middle) == value){
         return middle;
       } else {
      //   otherwise, update high, low, and middle
          if(data.get(middle) > value){
            //if middle is greater than value, search lower half
            high = middle - 1;
            middle = (high + low)/2; 
            //low stays the same.
          } else {
         //if middle is less than value, search upper half  
            low = middle + 1;
            middle = (high + low)/2;
          }
       }
     }
      return -1; //item not found
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    // public int binarySearchRecursive(int value, int lowIndex, int highIndex){

    //   // COPY AND PASTED! NEEDS REFACTOR!
    //   int tPos = -1; //init return var to flag/signal value

    //   int mPos = (loPos + hiPos) / 2; //init tracker var for middle position
    //   System.out.println("mPos: " + mPos);
    //   //exit case. If lo & hi have crossed, target not present
    //   if (loPos > hiPos){
    //     return -1;
    //   } else if (data.get(mPos) == target) {  // target found 
    //     return mPos;
    //   }
    // // value at mid index higher than target
    //   else if (data.get(mPos) > target) {
    //     // low should stay the same.
    //     // high position should be the middle
    //     return binarySearchRecursive(target, loPos, mPos-1);
    //   }
    //   // value at mid index lower than target
    //   else if (data.get(mPos) < target) {
    //     //new low position should be middle position
    //     //high should stay the same.
    //     return binarySearchRecursive(target, mPos+1, hiPos);
    //   }

    //   return tPos;
    // }
    	
    public String toString(){
	    return ""+data;
    };

    public void builtinSort(){
	    Collections.sort(data);
    }

   /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size)
    {
	    ArrayList<Integer>  newlist = new ArrayList<Integer>();
	    Random r = new Random();
	    int nextval = r.nextInt(20)+1;
	    for (int i=0;i<size;i++)
      {
	      newlist.add(nextval);
	      nextval = nextval + r.nextInt(20);
	    }

	    return newlist;
	  }

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
  public ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
      ArrayList<Integer> merged = new ArrayList<Integer>();
      //setting up a comparison about comparing the values
      //at each time
      while (list1.size()>0 && list2.size()>0)
      {
        if (list1.get(0) < list2.get(0))
        {
          merged.add(list1.get(0));
          list1.remove(0);
        }
        else
        {
          merged.add(list2.get(0));
          list2.remove(0);
        }
      }
      while (list1.size()>0)
      {
        merged.add(list1.get(0));
        list1.remove(0);
      }
      while (list2.size()>0)
      {
        merged.add(list2.get(0));
        list2.remove(0);
      }
      return merged;
    }

  public ArrayList<Integer> mergeSort(ArrayList<Integer> list1)
  {
    ArrayList<Integer> leftSide = new ArrayList<Integer>();
    ArrayList<Integer> rightSide = new ArrayList<Integer>();
    if (list1.size() <= 1)
    {
      return list1;
    }
    int mid = (list1.size()/2);
    //populate left hand side
    for (int i = 0; i < mid; i++)
    {
      leftSide.add(list1.get(i));
    }
    //populate right hand side
    for (int j = mid; j < list1.size(); j++)
    {
       rightSide.add(list1.get(j));
    }

    leftSide = mergeSort(leftSide);
    rightSide = mergeSort(rightSide);

    return merge(leftSide, rightSide);
    
    //calling mergeSort within itself
    //left side from 0 to mid - 1
    //right side from mid to list1.size()


  }
  
}