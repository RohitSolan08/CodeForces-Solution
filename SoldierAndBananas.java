import java.util.*;
import java.util.Scanner;

public class   SoldierAndBananas{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         int sum=0;
         
         int k = sc.nextInt();
         int n = sc.nextInt();
         int w = sc.nextInt();
         
         for(int i =1; i<=w;i++)
         {
           sum = sum+ k*i;  
         }
         if(sum>n)
         {
         int ans = Math.abs(sum-n);
          System.out.println(ans);
         }
         else
         {
             System.out.println(0);
         }
        
         }
}

