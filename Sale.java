import java.util.*;
import java.lang.Math;

public class Sale {
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int sum =0;
      
      ArrayList<Integer> al = new ArrayList<>();
      
      for(int i =0 ; i < n; i++)
      {
          int x = sc.nextInt();
          
          al.add(x);
      }
      Collections.sort(al);
     
      for(int i =0; i< m;i++)
      {
          if(al.get(i) < 0)
          {
          sum = sum + Math.abs(al.get(i));
          }
      }
      

      System.out.println(sum);
	  
	}
}
