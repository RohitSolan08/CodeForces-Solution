import java.util.*;
import java.util.Scanner;

public class SystemOfEquations{

    public static void main(String[] args){
        
        int count =0;
         Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          int m = sc.nextInt();
          
          for(int a =0; a*a <= n && a <=m; a++)
          {
              int b = n- a*a;
              
              if(a + b*b ==m)
              {
                  count++;
              }
          }
          System.out.println(count);
          
       
        
}

}

