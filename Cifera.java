import java.util.*;
import java.util.Scanner;
 
public class  Cifera{
 
    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
      
     int k = sc.nextInt();
     int l = sc.nextInt();
     int count =-1;
     
     while(l % k ==0)
     {
         l /=k;
         
         count++;
     }
     if(count >=0 && l ==1)
     {
         System.out.println("YES");
         System.out.println(count);
     }
     else
     {
         System.out.println("NO");
     }
    
    }
}