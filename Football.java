import java.util.Scanner;

public class Football
{
	public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         
         String s1 = sc.nextLine();
  
  
    if(s1.contains("0000000") || s1.contains("1111111"))
    {
        System.out.println("YES");
        
    }
    else
    {
        System.out.println("NO");
    }
    }
}