import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Loops{

  public static void main (String[] args){

    double a;
    Scanner in = new Scanner(System.in);

    System.out.println("What number would you like to find the square root of?");
    a = in.nextInt();
    squareRoot(a);
    System.out.println("The square root of " + a + " is " + squareRoot(a));
  }

  public static double squareRoot(double a){

    double oldAnswer = a/2;
    double newAnswer = a/2;
    double testValue = 0;

    do{
      oldAnswer = newAnswer;
      newAnswer = (oldAnswer + a/oldAnswer)/2.0;
      testValue = Math.abs(newAnswer - oldAnswer);
    }
    while(testValue > .001);
    return newAnswer;
    
  }
}

