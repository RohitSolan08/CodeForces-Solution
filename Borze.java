/*
------------------------------
Code By- Rohit Solan
------------------------------
CodeForces Problem 
*/
import java.util.*;
 
public class Borze
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  
        String input = sc.nextLine();  //Input taken by User 
        String ans = "";
        
        for(int i =0; i< input.length();i++)      
        {
            if(input.charAt(i) == '-' && input.charAt(i+1) =='-')
            {
                ans += "2";
                i++;
            }
            else if(input.charAt(i) == '-' && input.charAt(i+1) =='.')
            {
                ans += "1";
                i++;
            }
            else
            {
                ans += "0";
            }
            
            
            
        }
        System.out.println(ans);
       
       
    }
}