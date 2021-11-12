import java.util.*;
import java.util.Scanner;

public class  Rounding{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
        long mod = n%10;
        
        if(mod <= 5){
        n -= mod;
    }
    else{
        n += (10 - mod);
    }
    
    System.out.println(n);

         }
}

