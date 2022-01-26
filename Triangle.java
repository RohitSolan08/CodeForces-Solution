import java.util.Scanner;
import java.util.*;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if((a < b+c && b < a+c && c < b+a) || (a < b+d && b < a+d && d < a+b) || (a < c+d && c <a+d && d < a+c)|| (b<c+d && c < b+d && d < b+c))
        {
            System.out.println("TRIANGLE");
            
        }
        else if((a == b+c || b == a+c  || c == b+a) || (a == b+d || b == a+d || d == a+b) || (a == c+d || c == a+d || d == a+c)|| (b == c+d ||c == b+d || d == b+c))
        {
            System.out.println("SEGMENT");
        }
        else
        {
            System.out.println("IMPOSSIBLE");
        }
    }
}
