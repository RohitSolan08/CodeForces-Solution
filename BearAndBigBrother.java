import java.util.*;
import java.util.Scanner;

public class  BearAndBigBrother{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         
         int count=0;
        
        while(n<=m)
        {
          n = n*3;
          m= m*2;
          count++;
        }
        System.out.println(count);
         }
}

