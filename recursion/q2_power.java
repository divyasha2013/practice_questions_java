import java.util.*;
public class q2_power
{

  public static int pow(int x,int n)
  {
   if(n==0)       //base class
    return 1;

   int a=power(x,n/2);//recursive call
   int p=a*a;          //small calculations

   if(n%2==1)
    p=p*x;

   return p;
  }
  
  public static void main(String[] args)
  {
    System.out.println(pow(2,3));
  }
}
