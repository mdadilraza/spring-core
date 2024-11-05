package spring_day1;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        //BigInteger b=BigInteger.valueOf( sc.nextInt());
        System.out.println(isPrime(13));
        
    }
    public static String isPrime( int b) {
    	boolean b1=true;
      if(b <2) {
    	  b1=false;
      }
      else {
    	  for(int i=2 ; i<= Math.sqrt(b) ;i++) {
    		  if( b % i==0)
    			  b1=false;
    		  break;
    	  }
      }
      if(b1)
    	  return "prime";
      else
    	  return "not prime";
    }
}