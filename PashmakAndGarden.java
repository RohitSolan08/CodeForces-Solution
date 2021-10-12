import java.util.*;
import java.util.Scanner;

public class PashmakAndGarden{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         int x1 = sc.nextInt();
         int y1 = sc.nextInt();
           int x2 = sc.nextInt();
         int y2 = sc.nextInt();
         int x3 = 0;
         int y3 =0;
         int x4=0;
         int y4=0;
         
         boolean isAnswer =  true;
         
         if(x1 == x2 && y1 == y2)
         {
             isAnswer = false;
         }
         else if(x1 == x2)
         {
             x3 = x1 + Math.abs(y2-y1);
             y3 =y1;
             x4 = x2 + Math.abs(y2-y1);
             y4 = y2;
         }
         else if(y1 == y2)
         {
             x3 = x1;
             y3 = y1 + Math.abs(x1-x2);
             x4 = x2;
             y4 = y2 + Math.abs(x1-x2);
         }
         else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
			x3 = x1;
			y3 = y2;
			x4 = x2;
			y4 = y1;
         }
         else
         {
             isAnswer = false;
         }
         if(isAnswer == true)
         {
             System.out.println(x3 + " "+ y3 + " " + x4 + " "+ y4); 
         }
         else
         {
             System.out.println("-1");
         }
         
        
}
}

