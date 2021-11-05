import java.util.*;
import java.util.Scanner;

public class FileName{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        sc.nextLine();
        
        String s = sc.nextLine();
        
        int count =0; 
         for(int i =0; i < s.length()-2; i++)
         {
             if(s.charAt(i) == 'x' && s.charAt(i+1) == 'x' && s.charAt(i+2) == 'x')
             {
                 count++;
             }
             
         }
         System.out.println(count);
        
       
         }
}

