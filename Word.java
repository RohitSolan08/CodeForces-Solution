import java.util.*;
 
public class Word
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length();
        int upper =0;
        int lower =0;
        
        for(int i =0; i <n ; i++)
        {
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upper++;
            }
            if(Character.isLowerCase(ch))
            {
                lower++;
            }
        }
        String ans = "";
        if(lower > upper)
        {
          ans =   input.toLowerCase();
        }
        if(upper > lower )
        {
ans = input.toUpperCase();
        }
        if(upper == lower)
        {
          ans =   input.toLowerCase();
        }
        System.out.println(ans);
    }
}