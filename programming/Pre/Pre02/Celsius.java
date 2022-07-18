import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celsius{

  public static void main (String[] args){

    double celsius;
    Scanner in = new Scanner(System.in);

    System.out.println("What is the temperature in celsius?");
    celsius = in.nextDouble();
    System.out.println("The temperature in celsius is " + celsius);
    System.out.printf("The temperature in fahrenheit is %.1f", + ((celsius * (9.0/5.0)) + 32.0));
  }
}