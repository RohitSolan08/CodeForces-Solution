import java.util.*;
import java.util.Scanner;

public class BearAndRaspberry{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int c = sc.nextInt();
         
         int t =0;
         
         int[] a = new int[n];
         for(int i =0; i < n;i++)
         {
             a[i] = sc.nextInt();
         }
         
         
           for(int i =0 ;i < n-1; i++)
           {
               t = Math.max(t , a[i] - a[i+1] -c);
           }
       
         System.out.println(t);
        
}
}

