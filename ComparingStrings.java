import java.lang.*;
import java.io.*;
import java.util.*;

public class ComparingStrings
{
    public static void main(String[] args){
        
     Scanner scan = new Scanner(System.in);
        String stringOne,stringTwo;
 
        stringOne = scan.nextLine();
        stringTwo = scan.nextLine();
        int counter=0;
 
        char[] st1 = stringOne.toCharArray();
        char[] st2 = stringTwo.toCharArray();
 
        if(stringOne.length()!=stringTwo.length())
        {
            System.out.println("NO");
            System.exit(0);          
        }
 
        for(int i=0;i<stringOne.length();i++)
        {
            if(st1[i]!=st2[i])
                counter++;   
        }
        boolean flag = false;
        if(counter==2){
            Arrays.sort(st1);
            Arrays.sort(st2);
            flag=Arrays.equals(st1, st2);           
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");       
    }
}
