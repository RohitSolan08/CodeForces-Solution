import java.util.*;
import java.util.Scanner;

public class RepeatingCipher{

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        sc.nextLine();
        
        String s = sc.nextLine();
        
        int k =1;
        String ans = "";
        for(int i =0; i < s.length(); i++)
        {
      char c = s.charAt(i);
      ans = ans + c;
      i = i+k;
          k++;
        }
        
        System.out.println(ans);
         }
}

