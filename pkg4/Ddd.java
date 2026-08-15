package pkg4;
import java.util.*;
public class Ddd
{
     int e,f;
     
     public void fndivi()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements:");
        e=sc.nextInt();
        f=sc.nextInt();
        if(f==0)
        {
            System.out.println("division error");            
        }
        else
        {
            System.out.println("division is:"+(e/f));
        }    
    }
}
