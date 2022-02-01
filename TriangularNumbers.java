import java.util.Scanner;
import java.util.*;
public class TriangularNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n = sc.nextInt();
        long val = 8*n+1;
        double fix = Math.sqrt(val)-1;
        long dec = (long)fix;
        dec/=2;
        dec*=(dec+1);
        dec/=2;
        
        if(dec == n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
