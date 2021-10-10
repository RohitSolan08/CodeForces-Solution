import java.util.*;
import java.util.Scanner;

public class WatchingAMovie{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int x = sc.nextInt();
         
         int t = 1;
         int ans =0;
         for(int i =0; i < n; i++)
         {
             int l = sc.nextInt();
             int r = sc.nextInt();
             
             t += x * ((l-t)/x);
             ans += r- t +1;
             t = r+1;
         
         }
         System.out.println(ans);
  
         
  
        
}
}
