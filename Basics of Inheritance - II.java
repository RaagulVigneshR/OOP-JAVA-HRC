import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//BODY BEGINS HERE
class Arithmetic{
  public String getName()
  {
    return "Arithmetic";
    
  }
}
class Multiplier extends Arithmetic
{
  public int multiply(int a, int b)
  {
    return a*b;
     
  }  
}



//BODY ENDS HERE

public class Solution{
  public static void main(String []args){
    // Create a new Multiplier object
    Multiplier a = new Multiplier();
     
    // Print the name of the superclass on a new line
    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());   
     
    // Print the result of 3 calls to Multiplier's `multiply(int,int)` method as 3 space-separated integers:
    System.out.print(a.multiply(5,10) + " " + a.multiply(10,10) + " " + a.multiply(20,10) + "\n");
   }
}
