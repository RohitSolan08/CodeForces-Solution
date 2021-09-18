import java.util.*;

public class PetyaAndStrings {
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    String s1 = sc.nextLine();
	    String s2 = sc.nextLine();
	      String first = s1.toLowerCase();
	        String second = s2.toLowerCase();

	    
	    if(first.compareTo(second) ==0)
	    {
	        System.out.println("0");
	    }
	    else if(first.compareTo(second) > 0)
	    {
	        System.out.println("1");
	    }
	    else
	    {
	        System.out.println("-1");
	    }
	}

}
