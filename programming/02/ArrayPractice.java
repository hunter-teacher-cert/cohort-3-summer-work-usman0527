import java.io.*;
import java.util.*;
import java.util.Random;

public class ArrayPractice{

    public static void main (String[] args)
    {
      int[] data = buildRandomArray(10,20);
      printArray(data);
      int [] testArray = {1,3,5,7,9,11};
      printArray(testArray);
      int index = firstOccurence(testArray, 5);
      System.out.println(index);
      int max = findMaxValue(testArray);
      int max2 = findMaxValue(data);
      System.out.println(max);
      System.out.println(max2);
      int sum = arraySum(testArray);
      System.out.println(sum);
    }


  
    public static int[] buildRandomArray(int size, int maxValue) //builds a random array
    {
      Random r = new Random();
      int [] data = new int[size];
      for (int i = 0; i < size; i++)
        {
          data[i] = r.nextInt(maxValue);
        }    
      return data;
    }


  
    public static void printArray(int[] data) //prints arrays
    {
      for (int i = 0; i<data.length; i++)
        {
          System.out.print(data[i] + " ");
        }
      System.out.println(" ");
    }


  
    public static int firstOccurence(int[] data, int value) // finds where a value is first located
    {
      int index = -1;
      for (int i = 0; i<data.length; i++)
        {
          if (data[i] == value)
          {
            index = i;
          }
        }
      return index;
    }

    public static int findMaxValue(int[] data)
    {
    int max = data[0];
    for (int i = 1; i < data.length; i++)
      {
        if (data[i] > max)
        {
          max = data[i];
        } 
      }
    return max;
    }

    public static int arraySum(int [] data)
    {
      int sum = 0;
      for (int i = 0; i < data.length; i++)
        {
          sum = sum + data[i];
        }
      return sum;
    }

    /*
  public static boolean isSorted(int[] data)
    {
    smallerNumber = data[0];
      for (int i = 1; i < data.length; i++)
        if (data[i] < smallerNumber)
        {
          smallerNumber = data[i];
          return true;
        }
        else
        {
          return false;
        }
    }
  */
  
    
}