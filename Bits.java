import java.util.*;

public class Bits {
	
	public static void main(String[] args)
	{
	    Scanner sc  = new Scanner(System.in);
	    
        int n = sc.nextInt();
        int x =0;
        for(int i =0; i <n; i++)
        {
            char operator = sc.next().charAt(1);
            sc.nextLine();
            if(operator == '+')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        System.out.println(x);
	}

}
