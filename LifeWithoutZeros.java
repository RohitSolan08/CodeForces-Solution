import java.util.*;
import java.util.Scanner;

public class LifeWithoutZeros{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          
          int c = a+b;
          
          String s1 = Integer.toString(a);
           String s2 = Integer.toString(b);
            String s3 = Integer.toString(c);
       
         s1 = s1.replace("0","");
         s2 = s2.replace("0","");
         s3 = s3.replace("0","");
         
         //System.out.println(s1 + " "+ s2+ " "+ s3);
         
         int i = Integer.parseInt(s1);
          int j = Integer.parseInt(s2);
           int k= Integer.parseInt(s3);
           
           int sum = i +j;
           
           if(sum == k)
           {
               System.out.println("YES");
           }
           else
           {
             System.out.println("NO");  
           }
        
}
}
