import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Beer{

  public static void main (String[] args){

    int bottles;
    Scanner in = new Scanner(System.in);

    System.out.println("How many bottles do you have?");
    bottles = in.nextInt();
    song(bottles);
  }

  public static void song(int numBottles){

    if (numBottles == 0) {
      System.out.println();
      System.out.println("No bottles of beer on the wall,");
      System.out.println("No bottles of beer,");
      System.out.println("Ya can't take one down, ya can't pass it around");
      System.out.println("Cause there are no more bottles of beer on the wall!");
    } 
    
    else {
      System.out.println(numBottles + " bottles of beer on the wall,");
      System.out.println(numBottles + " bottles of beer on the wall,");
      System.out.println("Ya take one down, ya pass it around");
      System.out.println((numBottles - 1) + " bottles of beer on the wall,");
      System.out.println();
      song(numBottles - 1);
    }
    
  }
}


//No bottles of beer on the wall,
//no bottles of beer,
//ya’ can’t take one down, ya’ can’t pass it around,
//’cause there are no more bottles of beer on the wall!

//99 bottles of beer on the wall,
//99 bottles of beer,
//ya’ take one down, ya’ pass it around,
//98 bottles of beer on the wall.