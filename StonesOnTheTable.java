import java.util.*;
 
public class StonesOnTheTable
{
    public static void main(String[] args)
    {
               
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
 
		// Counters
		int counter = 0;
		char last = s.charAt(0);
 
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last) counter++;
			else last = s.charAt(i);
		}
 
		// Output
		System.out.println(counter);
}
}
