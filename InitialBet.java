import java.util.*;
import java.util.Scanner;

public class   InitialBet{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int sum =0;
         
         for(int i =0; i<5;i++)
         {
             int a = sc.nextInt();
              
              sum +=a;
              
         }
         if(sum%5 ==0 && sum/5 != 0)
         {
             System.out.println(sum/5);
         }
         else if(sum ==0)
         {
             System.out.println(-1);
         }
         else
         {
             System.out.println(-1);
         }
         }
}

