import java.util.*;
import java.util.Scanner;

public class LunchRush{

    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      
    int mn = -1000000000;
    
    for(int i =0; i<n; i++)
    {
        int f = sc.nextInt();
        int t = sc.nextInt();
        
        if(t <= k)
        {
            mn = Math.max(mn,f);
        }
        else
        {
            mn = Math.max(mn,f-(t-k));
        }
        
    }
    
    System.out.println(mn);
    }
}
