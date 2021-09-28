import java.util.Arrays;
import java.util.Scanner;

public class Sleuth {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
       String s = sc.nextLine();
       s = s.toLowerCase();
       s = s.replaceAll(" ","");
    //   System.out.println(s);
      
     if(s.charAt(s.length()-2) == 'a' || s.charAt(s.length()-2) == 'e' || s.charAt(s.length()-2) == 'i' || s.charAt(s.length()-2) == 'o' || s.charAt(s.length()-2) == 'u' || s.charAt(s.length()-2) == 'y')
     {
         System.out.println("YES");
     }
        else
        {
            System.out.println("NO");
        }

}
}

