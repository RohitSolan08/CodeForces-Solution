import java.util.*;
import java.util.Scanner;

public class TaymyrISCallingYou{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int m = sc.nextInt();
         int z = sc.nextInt();
         int count=0;
         
        for(int i =m; i <= z; i= i+m)
        {
            for(int j =n; j <=z; j= j+n)
            {
                if(i ==j)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
         

       
         }
}

