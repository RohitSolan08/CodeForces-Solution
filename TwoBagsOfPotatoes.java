import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;
 
public class TwoBagsOfPotatoes{
 
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int y = sc.nextInt();
         int k = sc.nextInt();
         int n = sc.nextInt();
         
         int x =1;
         
         if(y >=n)
         {
             System.out.println(-1);
         }
         
         for(int i =1; i <= n; i++)
         {
             if((x+y) <=n)
             {
                 if((x+y)%k==0)
                 {
                     System.out.print(x + " ");
                     x++;
                 }
                 else
                 {
                     x++;
                 }
             }
           
         }
           System.out.println();
 
}
}
