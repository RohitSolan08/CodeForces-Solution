import java.lang.*;
import java.io.*;
import java.util.*;

public class Translation
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
            
             String s1 = sc.next();
             
             String s2 = sc.next();
             
             StringBuilder input = new StringBuilder(s2);
             
             if(s1.equals(input.reverse().toString()))
             {
                 System.out.println("YES");
             }
             else
             {
                 System.out.println("NO");
             }
    }
}
