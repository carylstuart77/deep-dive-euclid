package edu.cnm.deepdive.algorithms;

/** Implement the classic Euclid algorithm for finding the GCD of 2
 * integers.  When run as a Java application, the input values are
 * read from the command line aruments.
 * @author Caryl Stuart
 */

public class Euclid {
  /** Format string usd for display of input values and GCD. */

  public static final String DISPLAY_FORMAT = "GCD(%,d, %,d) = %,d%n";

  //Command line input
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    //Call method gcd below
    int gcd = gcd(a, b);
    //%place holders; d is what type like int; %n is new line
    //printf f is for fload and defines d as int
    System.out.printf(DISPLAY_FORMAT, a, b, gcd );

  }
  //this is the algorithm Greatest Ccmmon Denominator

  /**
   * Computers and returns the GCD of 2 integers, using the modular division form of
   * Euclid's algorithm.
   *
   * @param a first input
   * @param b second input
   * @return GCD of <code>a</code> and <code>b</code>
   */
  public static int gcd(int a, int b) {
    //absolute value
    a = Math.abs(a);
    b = Math.abs(b);
    //find larger of two numbers
    int c = Math.max(a, b);
    b = Math.min(a, b);
    //a is larger of the two
    a = c;
    while (b > 0) {
      c = a % b;
      a = b;
      b = c;
    }
    return a;
    /*
    if (a == 0 || b == 0){
      // will stop here if 0; stack popped off
      return Math.max(a,b);
    }
    // jump out when a and b are equal
    while (a != b){
      //TODO look at this code--this will track your todos
      //FIXME code below needs xyz--this needs something to be fixed
      if (a > b) {
        a -= b;
      } else {
        //subtract smaller
        b-=a;
      }
    }
    return a;
  }*/
  }
}

