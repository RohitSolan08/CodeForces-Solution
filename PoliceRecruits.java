import java.util.Scanner;
import java.util.*;

public class PoliceRecruits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
       int n = sc.nextInt();
       
       int untreated =0;
       int cutoff = 0;
       for(int i =0; i<n;i++)
       {
          int x = sc.nextInt();
          
          if(x>0)
          {
              cutoff +=x;
          }
          else
          {
              if(cutoff<1)
              {
               untreated++;   
              }
              else
              {
                  cutoff--;
              }
          }
       }
       System.out.println(untreated);
    }
}