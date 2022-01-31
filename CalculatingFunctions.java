import java.util.Scanner;
import java.util.*;
public class CalculatingFunctions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        long c = sc.nextInt();
        
        if(c%2 == 0)
        {
            System.out.println(c/2);
        }
        else
        {
            System.out.println(-((c+1)/2));
        }
    }
}
