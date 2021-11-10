import java.util.*;
import java.util.Scanner;

public class  Compote{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int ans =0;
         
        for(int i =1;i<=a;i++)
        {
            if((b>=i*2)&&(c>=i*4))
            {
          ans = i+(i*2)+(i*4);  
        }
        else
        {
            break;
        }
        }
        System.out.println(ans);

         }
}

