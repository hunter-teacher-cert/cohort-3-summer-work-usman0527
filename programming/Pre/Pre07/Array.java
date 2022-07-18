import java.io.*;
import java.util.*;

//Chapter 7 Think Java Exercise 1
public class Array{

//method to take a double array a, raise each element to a given power p, and return a new double array b
  public static double[] powArray(double[] a, int p){
    double b[];
    b = new double[5];
    for(int i=0; i < 5; i++){
      double temp = a[i];
      b[i] = 1;
      for(int j = 1; j <= p; j++){
        b[i] = b[i] * temp;
      }
    }
    return b;
  }

  public static void main(String[]args){
    //create variable for power and arrays for original values and for values raised to power
    int power = 4;
    double values[];
    double valPowers[];
    values = new double[5];
    valPowers = new double[5];
    //fill array Powers with {1, 2, 3, 4, 5} and display values as a[]
    for(int i = 1; i <= 5; i++){
      values[i-1] = i;
      System.out.println("a ["+(i-1)+"] = "+values[i-1]);
    }
    //call method powArray and display results as a[]^p
    valPowers = powArray (values, power);
    for(int i = 1; i < 6; i++){
      System.out.println("a ["+(i-1)+"] ^ "+power+" = "+valPowers[i-1]);
    }
  
  }

}