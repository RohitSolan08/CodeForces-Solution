import java.util.*;
import java.util.Scanner;

public class Laptops{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count=0;
        
        for(int i =0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(b > a)
            {
                if(a<b)
                {
                   count++;
                }
        }
        }
        if(count >0)
        {
            System.out.println("Happy Alex");
        }
        else
        {
          System.out.println("Poor  Alex");    
        }

        
}

}
