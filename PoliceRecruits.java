import java.util.Scanner;
import java.util.*;

public class PoliceRecruits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
       int n = sc.nextInt();
       
       int un =0;
       int cut = 0;
       for(int i =0; i<n;i++)
       {
          int x = sc.nextInt();
          
          if(x>0)
          {
              cut +=x;
          }
          else
          {
              if(cut<1)
              {
               un++;   
              }
              else
              {
                  cut--;
              }
          }
       }
       System.out.println(un);
    }
}