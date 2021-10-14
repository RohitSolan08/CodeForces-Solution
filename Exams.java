import java.util.*;
import java.util.Scanner;

public class Exams{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
          int n = sc.nextInt();
          int k = sc.nextInt();
          
          while(2*n != k && n >0)
          {
              n -=1;
              k -=3;
          }
              
              if(n *2  == k)
              {
                  System.out.println(n);
              }
              else
              {
                  System.out.println(0);
              }
          
    
    
    
    
        
}

}
