import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Methods{

  public static void main (String[] args){

    int divisNum1;
    int divisNum2;
    int side1;
    int side2;
    int side3;
    int ack1;
    int ack2;
    Scanner in = new Scanner(System.in);

    //divisibilty
    System.out.println("What's the first number you want to check for divisibilty?");
    divisNum1 = in.nextInt();
    System.out.println("What's the second number you want to check for divisibilty?");
    divisNum2 = in.nextInt();
    isDivisible(divisNum1, divisNum2);
    System.out.println("Divisiblity: " + isDivisible(divisNum1, divisNum2));
    System.out.println();

    //triangle
    System.out.println("Now let's test if the three sides you chose can form a triangle. What's the value of the first side?");
    side1 = in.nextInt();
    System.out.println("What's the value of the second side?");
    side2 = in.nextInt();
    System.out.println("What's the value of the third side?");
    side3 = in.nextInt();
    triangleTester(side1, side2, side3);
    System.out.println("Can these sides form a triangle? " + triangleTester(side1, side2, side3));
    System.out.println();

    //Ackermann
    System.out.println("Now let's try Ackermann's formula. Choose a number:");
    ack1 = in.nextInt();
    System.out.println("Choose a second number:");
    ack2 = in.nextInt();
    ackermann(ack1, ack2);
    System.out.println("The solution to Ackermann's formula for your number is " + ackermann(ack1, ack2));
  }

  public static boolean isDivisible(int num1, int num2){

    if (num1 % num2 == 0){
      return true;
    }
    else{
      return false;
    }
  }

  public static boolean triangleTester(int side1, int side2, int side3){
    if(side1 > side2 + side3){
      return false;
    }
      else if(side2 > side1 + side3){
        return false;
      }
      else if(side3 > side1 + side2){
          return false;
        }
    else{
      return true;
    }
      }

  public static int ackermann(int m, int n){
    if (m==0){
      return n+1;
    }
    else if (m>0 && n == 0){
      return ackermann(m-1,1);
    }
    else if (m > 0 && n > 0){
      return ackermann(m-1, ackermann(m, n-1));
    }
    else{
      return 500;
    }
  }
    }
  