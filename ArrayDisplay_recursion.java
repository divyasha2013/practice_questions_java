import java.util.*;

public class ArrayDisplay_recursion
{
    public static void display1(int[] arr,int indx)
    {
        if(indx==arr.length)
           return;
        
        System.out.println(arr[indx]);
        display1(arr,indx+1);

    }
    
    public static void display2(int[] arr,int indx)
    {
        if(indx==arr.length)
        return;
        
        display2(arr,indx+1);
        System.out.println(arr[indx]);

    }
    
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        display1(arr,0);
        display2(arr,0);
    }
}
