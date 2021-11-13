import java.util.*;
import java.util.Scanner;

public class  BrainsPhoto{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         
         int count=0;
         
         char[][] a = new char[n][m];
         
         for(int i =0; i<n;i++)
         {
             for(int j =0; j<m;j++)
             {
                a[i][j] = sc.next().charAt(0);
                
                if(a[i][j] == 'C' || a[i][j] == 'M' || a[i][j] == 'Y' )
                {
                    count++;
                }
             }
         }
         if(count>0)
         {
             System.out.println("#Color");
             
         }
         else
         {
             System.out.println("#Black&White");
         }
         }
}

