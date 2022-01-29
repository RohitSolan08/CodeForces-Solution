import java.util.Scanner;
import java.util.*;
public class CalculatingFunctions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        long n = sc.nextInt();
        
        if(n%2 == 0)
        {
            System.out.println(n/2);
        }
        else
        {
            System.out.println(-((n+1)/2));
        }
    }
}
