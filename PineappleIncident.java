import java.util.*;
import java.util.Scanner;

public class  PineappleIncident{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         int s = sc.nextInt();
         int x = sc.nextInt();
         
         
       if(x>t+1){
    if((x-t)%s==0||(x-t-1)%s==0){
        System.out.println("YES");
    }
    else System.out.println("NO");
    }
    else{
        if(x==t)  System.out.println("YES");
        else System.out.println("NO");
    }
     
     
    
    }
}
