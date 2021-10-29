import java.util.*;
import java.io.*;

public class WrongSubtraction {
	public static void main(String args[])  {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a = sc.nextInt();
	    
	    for(int i =0;i<a;i++)
	    {
	        int last = n%10;
	        
	        if(last != 0)
	        {
	            n--;
	        }
	        else
	        {
	            n =n/10;
	        }
	    }
	    System.out.println(n);
	
	}
}
