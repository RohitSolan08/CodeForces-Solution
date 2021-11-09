import java.util.*;
import java.util.Scanner;

public class VasyaTheHipster{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int mn = Math.min(n,m);
        
        int diff = Math.abs(n-m);
        int ans = diff/2;
        
        System.out.println(mn + " " +ans);
        
        

         }
}
