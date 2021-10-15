import java.util.*;
import java.util.Scanner;

public class InSearchOfAnEasyProblem{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          
          int countHard =0;
          int[] arr = new int[n];
          
          for(int i =0; i < n; i++)
          {
              arr[i] = sc.nextInt();
              
              if(arr[i] == 1)
              {
                  countHard++;
              }
          }
          if(countHard >0)
          {
              System.out.println("HARD");
          }
          else
          {
              System.out.println("EASY"); 
          }
         
        
    
        
}

}

