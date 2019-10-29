import java.util.*;
public class q2_power
{

  public static int pow(int x,int n)
  {
   if(n==0)
    return 1;

   int a=power(x,n/2);
   int p=a*a;

   if(n%2==1)
    p=p*x;

   return p;
  }
  
  public static void main(String[] args)
  {
    System.out.println(pow(2,3));
  }
}
