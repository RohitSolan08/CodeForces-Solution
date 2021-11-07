import java.util.*;
import java.util.Scanner;

public class VanyaAndFence{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int z = sc.nextInt();
        int countA =0;
         int countB =0;
        
        for(int i =0; i <n; i++)
        {
            int a = sc.nextInt();
            
            if(a <= z)
            {
               countA++; 
            }
            else
            {
                countB++;
            }
        }
        int ans = (countA*1) + (countB*2);
        System.out.println(ans);
         }
}
