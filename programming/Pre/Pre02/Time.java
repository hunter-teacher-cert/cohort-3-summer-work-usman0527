import java.io.*;
import java.util.*;

public class Time{

  public static void main (String[] args){

    int hours = 21;
    int minutes = 36;
    int seconds = 45;
    int secondsSinceMidnight1 = hours * 60 * 60 + minutes * 60 + seconds;

    System.out.println("Seconds since midnight: " + secondsSinceMidnight1);
    System.out.println("Seconds remaining in the day: " + (86400 - secondsSinceMidnight1));
    System.out.println("Percentage of day that has passed: " + (secondsSinceMidnight1 * 100)/86400 + "%");

    int hours2 = 21;
    int minutes2 = 56;
    int seconds2 = 45;
    int secondsSinceMidnight2 = hours2 * 60 * 60 + minutes2 * 60 + seconds2;

    System.out.println("The time it took to complete this project was " + (secondsSinceMidnight2 - secondsSinceMidnight1) + " seconds");
  }
}