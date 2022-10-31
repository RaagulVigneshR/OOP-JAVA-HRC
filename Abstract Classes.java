import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Arithmetic
{
 abstract int add(int A,int B);
 abstract int subtract(int A,int B);
 abstract int multiply(int A,int B);
 abstract int divide(int A,int B);
}

//BODY STARTS HERE
class Calculator{
  int add(int A,int B){
    return A+B;
  }
  int subtract(int A,int B){
    return A-B;
  }
  int multiply(int A,int B){
    return A*B;
  }
  int divide(int A,int B){
    return A/B;
  }
}

//BODY ENDS HERE


public class Solution
{
 public static void main(String args[])
 {
  Calculator cal = new Calculator();
    int A = 10, B = 5;
    System.out.println("Addition Result : " + cal.add(A, B));
  System.out.println("Subtraction Result : " + cal.subtract(A, B));
  System.out.println("Multiplication Result : " + cal.multiply(A, B));
  System.out.println("Division Result : " + cal.divide(A, B));
 }
}
