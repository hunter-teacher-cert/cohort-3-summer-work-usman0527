import java.io.*;
import java.util.*;

public class Date{

  public static void main (String[] args){

    String day = "Tuesday";
    int date = 28;
    String month = "July";
    int year = 2022;

    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.print(day + " " + date + " " + month + " " + year);
    
  }
}