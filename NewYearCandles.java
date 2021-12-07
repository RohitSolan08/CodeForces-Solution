import java.util.*;
import java.util.Scanner;

public class   NewYearCandles{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int m = sc.nextInt();
         
         int ans = n;
         int d =0;
         int a =0;
         
         while(n>=m)
         {
          d = n/m;
          ans +=d;
          a = n %m;
          n = a +d;
         }
         System.out.println(ans);
    }
}
