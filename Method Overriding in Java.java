import java.util.*;
class DisneyCharacter{
  String getName(){
    return "Anonymous Disney Character";
  }
  String getPantsState(){
    return( "I may or may not be wearing pants");
  }
}

class DonaldDuck extends DisneyCharacter
{
String getName(){
    return "DonaldDuck";
  }
  String getPantsState(){
    return( "I do not wear pants");
  }
}

class MickeyMouse extends DisneyCharacter
{
String getName(){
    return "MickeyMouse";
  }
  String getPantsState(){
    return( "I wear pants");
  }
}






public class Solution{
   
  public static void main(String []args){
     DisneyCharacter c0 = new DisneyCharacter();
    DonaldDuck c1 = new DonaldDuck();
    MickeyMouse c2 = new MickeyMouse();
    System.out.println(c0.getName());
    System.out.println(c0.getPantsState());
    System.out.println(c1.getName());
    System.out.println(c1.getPantsState());
    System.out.println(c2.getName());
    System.out.println(c2.getPantsState());
  }
