import java.util.*;
import java.util.Scanner;

public class  MagicNumbers{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         boolean flag = true;
         
         String s = sc.nextLine();
         
         for(int i =0; i<s.length();)
         {
             if(s.charAt(i) == '1' || s.charAt(i+1) == '4' || s.charAt(i+2) == '4')
             {
                 i+=3;
             }
             else if(s.charAt(i) == '1' || s.charAt(i+1) == '4')
             {
                 i=i+2;
             }
             else if(s.charAt(i) == '1' )
             {
                 flag = true;
                 i++;
             }
             else
             {
                 flag = false;
                 break;
             }
         }
         if( flag == true)
         {
             System.out.println("YES");
         }
         else
         {
             System.out.println("NO");
         }
    }
}
