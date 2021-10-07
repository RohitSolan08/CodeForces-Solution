import java.util.*;
import java.util.Scanner;

public class GregWorkout{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int sumChest =0;
         int sumBiceps =0;
         int sumBack =0;
        
         for(int i =1; i <= n; i++)
         {
            int a = sc.nextInt();
            
            if(i%3 == 1)
            {
                sumChest +=a;
            }
            else if(i%3 ==2)
            {
                sumBiceps += a;
            }
            else
            {
                sumBack +=a;
            }
         }
         
        if(sumChest > sumBiceps && sumChest > sumBack)
        {
            System.out.println("chest");
        }
        else if(sumBiceps > sumChest && sumBiceps > sumBack)
        {
          System.out.println("biceps");   
        }
        else
        {
             System.out.println("back");
        }
         

}
}
