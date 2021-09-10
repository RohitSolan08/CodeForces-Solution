import java.util.*;
 
public class BeautifulMatrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int i = 3;
       int j =3;
       
       int row1 =0; 
       int col1=0;
       for(int i1 = 1; i1 <=5 ; i1++)
       {
           String s = sc.nextLine().replace(" ","");
           if(s.contains("1"))
           {
               row1= i1;
               col1 = s.indexOf("1") + 1;
               break;
           }
       }
       
       System.out.println(Math.abs(i-row1) + Math.abs(j - col1));
     
      
    }
}