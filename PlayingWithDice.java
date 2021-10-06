import java.util.*;
import java.util.Scanner;

public class   PlayingWithDice{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int countA=0;
         int countS=0;
         int countB=0;
         
         int a = sc.nextInt();
         int b = sc.nextInt();
         
         for(int i = 1; i<= 6; i++)
         {
             if(Math.abs(a-i) < Math.abs(b-i))
             {
                 countA ++;
             }
             else if(Math.abs(a-i) == Math.abs(b-i))
             {
                 countS++;
             }
             else
             {
                 countB++;
             }
         }
         System.out.println(countA+ " "+ countS+ " "+ countB);
         

}
}
