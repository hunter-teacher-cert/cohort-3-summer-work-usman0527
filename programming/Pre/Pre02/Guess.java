import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Guess{

  public static void main(String[] args){

    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int guess;
    Scanner in = new Scanner(System.in);

    System.out.println("What is your guess?");
    guess = in.nextInt();

    System.out.println("The random number is " + number);
    System.out.println("The difference between your number and the random number is " + (guess - number));
  }
}