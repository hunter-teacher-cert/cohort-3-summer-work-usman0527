/**
 * Rational class by Team BangPi
 * Usman Ahmed
 * collaborators: Yeidy Levels, Parmanand Mohanlall
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   + toString
   + default constructor
   + multiply
   + divide
   Intermediate level (complete Basic methods plus these methods):
   + floatValue
   + overloaded constructor
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    this._numerator = 0;
    this._denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    this._numerator = n;
    this._denominator = d;
    if(d==0)
    {
     System.out.println("This is an invalid response");
      this._numerator = 0;
      this._denominator = 1;
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
	return("The rational number is " + this._numerator + "/" + this._denominator);
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    double result = (double)this._numerator/this._denominator;
    return result;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    this._numerator = this._numerator * r._numerator;
    this._denominator = this._denominator * r._denominator;
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    if(r._numerator !=0)
    {
    this._numerator = this._numerator * r._denominator;
    this._denominator = this._denominator * r._numerator;
    }
    else
    {
      System.out.println("Invalid");
    }
  }

}//end class