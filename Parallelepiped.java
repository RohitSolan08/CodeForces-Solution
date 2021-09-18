import java.util.*;
import java.lang.Math;
 
public class Parallelepiped {
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	  double s1 = sc.nextInt();
	   double s2 = sc.nextInt();
	     double s3 = sc.nextInt();
	    
	    double a =Math.sqrt((s1*s3)/s2);
	    double b =Math.sqrt((s1*s2)/s3);
	    double c = Math.sqrt((s2*s3)/s1);
	   
	    int result = (int)(a+b+c)*4;
	   
	    
	    System.out.println(result);
	  
	}
}
