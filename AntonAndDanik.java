import java.util.*;
import java.util.Scanner;

public class   AntonAndDanik{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         sc.nextLine();
         String s = sc.nextLine();
         int countA=0;
         int countB=0;
         
         for(int i =0; i<s.length();i++)
         {
          if(s.charAt(i) == 'A')
          {
              countA++;
          }
          else
          {
              countB++;
          }
         }
         
         if(countA > countB)
         {
             System.out.println("Anton");
         }
         else if(countB > countA)
         {
             System.out.println("Danik");
         }
         else
         {
             System.out.println("Friendship");
         }
    }
}
