import java.util.Scanner;
import java.util.*;

public class TheNewYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
         int min = Math.min(a, Math.min(b,c));
        int max = Math.max(a,Math.max(b,c));
        System.out.println(max-min);
       
    }
}