import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class LongestUncommonSubsequence{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         String a = sc.nextLine();
         String b = sc.nextLine();
         
         if(a.equals(b) == true)
         {
             System.out.println(-1);
         }
         else
         {
             if(b.length() >= a.length())
             {
             System.out.println(b.length());
             }
             else
             {
               System.out.println(a.length());  
             }
         }
         
        
}
}
