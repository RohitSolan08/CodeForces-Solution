import java.util.*;
import java.util.Scanner;

public class Soroban{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         String  s = sc.nextLine();
         
         for(int i = s.length()-1; i > -1; i--)
         {
             int d = s.charAt(i) - '0';
             if(d >= 5)
             {
                 System.out.print("-O|");
                 d -= 5;
             }
             else
             {
                   System.out.print("O-|"); 
             }
             int rest = Math.abs(d -5);
             
             while(d >0)
             {
                 System.out.print("O");
                 d--;
             }
             System.out.print("-");
             while(rest > 1)
             {
                 System.out.print("O");
                 rest--;
             }
              System.out.println();
         
         }
        
}
}

