import java.util.*;
import java.util.Scanner;

public class  TheNumberOfPositions{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int n  = sc.nextInt();
         int a = sc.nextInt();
         int b = sc.nextInt();
         
         int standing = n-a-1;
         int result =0;
         if(standing>b)
         {
          result =b+1;   
         }
         else
         {
            result = standing+1;
         }
         System.out.println(result);
        
    }
}
