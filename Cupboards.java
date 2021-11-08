import java.util.*;
import java.util.Scanner;

public class Cupboards{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int right =0; 
        int left =0;
        
        for(int i =0; i<n;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 1)++left;
	        if(y == 1)++right;
        }
        
        int offRi = n- right;
        int offLe = n-left;
        
        int a = Math.min(offRi,right);
        int b = Math.min(offLe,left);
        
        System.out.println(a+b);
         }
}
