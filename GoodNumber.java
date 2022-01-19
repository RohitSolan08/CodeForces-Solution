import java.util.Arrays;
import java.util.Scanner;


public class GoodNumber {

    public static void main(String[] args) 
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int k=in.nextInt();
     boolean[] good=new boolean[n];
     Arrays.fill(good, true);
     int count=0;
     for(int i=0;i<n;i++)
     {
         String temp=in.next();
         for(int j=0;j<=k;j++)
         {
            //int x=j;
             String m=j+"";

             if(temp.contains(m)==true)
             {               
                 continue;
             }
             else
             {
                 good[i]=false;
                 break;
             }
         }
         if(good[i]==true)
             count++;
     }
     
     System.out.println(count);
     
     in.close();
    }

}
