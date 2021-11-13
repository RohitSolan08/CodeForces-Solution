import java.util.*;
import java.util.Scanner;

public class  VanyaAndCubes{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
        int d = 0;
        int count =0;
        int sum=0;
       for(int i =1; i<=n;i++)
       {
            d +=i;
             sum +=d;
          if(sum<=n)
          {
           count++;
          }
          else
          {
              break;
          }
          
       }
       
        System.out.println(count);

         }
}

