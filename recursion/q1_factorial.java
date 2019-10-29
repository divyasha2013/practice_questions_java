import java.util.*;

public class q1_factorial
{
  public static int fact(int n)
  {
    if(n==0)        //base case
      return 1;
    
    return n*fact(n-1);//recursive call with small calculation
  }
  
  public static void main(String[] args)
  {
    System.out.println(fact(5));
  }
}

//for n=5
//5*fact(4)-->4*fact(3)-->3*fact(2)-->2*fact(1)-->1*fact(0)
// and then return 1-->returns1*1-->returns 2*1-->returns 3*2-->returns 4*6-->returns 5*24==120
