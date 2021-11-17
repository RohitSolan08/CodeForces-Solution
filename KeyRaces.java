import java.util.*;
import java.util.Scanner;

public class   KeyRaces{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int s = sc.nextInt();
         int v1 = sc.nextInt();
         int v2 = sc.nextInt();
         int t1 = sc.nextInt();
         int t2 = sc.nextInt();
         
         int first = (s*v1)+(t1*2);
         int second = (s*v2)+(t2*2);
         
         if(first > second)
         {
             System.out.println("Second");
         }
         else if(first < second)
         {
             System.out.println("First");
         }
         else
         {
             System.out.println("Friendship");
         }
          

         }
}
