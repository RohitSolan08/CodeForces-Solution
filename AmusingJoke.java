import java.util.*;

public class AmusingJoke {
	
	public static void main(String[] args)
	{
	    Scanner sc  = new Scanner(System.in);
	    
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        String s3 = sc.nextLine().toLowerCase();
        String s4 = s1+s2;
        if(s4.length() == s3.length()){
            boolean flag = false;
            for(char aa='a';aa<='z';aa++){
                if(s4.contains(String.valueOf(aa))){
                    s4 = s4.replaceAll(String.valueOf(aa), "");
                    int x = s4.length();
                    s3 = s3.replaceAll(String.valueOf(aa), "");
                    int y = s3.length();
                    if(x != y){
                        flag = true;
                        break;
                    }                    
                }
            }
            if(!flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }else{
            System.out.println("NO");
        }
        sc.close();
     
	}

}
