import java.util.*;

public class HQ9 {
	
	public static void main(String[] args)
	{
	    Scanner sc  = new Scanner(System.in);
	    
      String s1 = sc.nextLine();
      int count =0;
      for(int i =0; i < s1.length(); i++)
      {
          if(s1.charAt(i) =='H' || s1.charAt(i) =='Q' || s1.charAt(i) =='9')
          {
            count++;
          }
      }
      if(count > 0)
      {
          System.out.println("YES");
      }
      else
      {
          System.out.println("NO");
      }
	}

}
