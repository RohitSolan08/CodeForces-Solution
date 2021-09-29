import java.util.Arrays;
import java.util.Scanner;

public class GameWithSticks{

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      int i =0;
      
      if(n >m)
      {
         i = m; 
      }
      else
      {
          i =n;
      }
      
      if(i%2 ==0)
      {
          System.out.println("Malvika");
      }
      else
      {
          System.out.println("Akshat");
      }
}
}
