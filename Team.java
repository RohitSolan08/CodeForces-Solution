import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class Team{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int count =0;
         
         int n = sc.nextInt();
        
        for(int i =0; i < n; i++)
        {
            int a = sc.nextInt() + sc.nextInt() + sc.nextInt();
            
            if(a >= 2)
            {
             count++;   
            }
        }
        System.out.println(count);
}
}

