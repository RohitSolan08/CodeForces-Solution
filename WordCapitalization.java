import java.util.*;
 
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
         String s = sc.nextLine();
         
         String firstLetter = s.substring(0,1);
         
         String LastLetter = s.substring(1);
         
         firstLetter = firstLetter.toUpperCase();
         
         String ans = firstLetter + LastLetter;
         
         System.out.println(ans);
    
			}
		}