import java.util.*;
import java.util.Scanner;

public class  MishkaAndGame{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          int countA =0;
          int countB =0;
          
          for(int i =0; i<n; i++)
          {
              int a = sc.nextInt();
              int b = sc.nextInt();
              
              if(a>b)
              {
                  countA++;
              }
              else if(b>a)
              {
                  countB++;
              }
              
          }
          
          if(countA > countB)
          {
              System.out.println("Mishka");
          }
          else if(countB > countA)
          {
              System.out.println("Chris");
          }
          else
          {
           System.out.println("Friendship is magic!^^");   
          }
        
       
         }
}

