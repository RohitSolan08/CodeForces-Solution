import java.util.*;
 
public class StringTask {
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
      
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        
        s1= s1.replaceAll("[aeiouy]", "");
        
    StringBuilder builder = new StringBuilder(s1);
        for(int i=0; i<builder.length(); i+=2)
        {
            builder.insert(i, '.');
        }
        System.out.println(builder);
}
}