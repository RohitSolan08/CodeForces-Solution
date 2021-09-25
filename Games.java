import java.util.Arrays;
import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int count =0;
        
        int n = sc.nextInt();
        
        int[] h = new int[n];
        int[] a = new int[n];
        
        for(int i =0; i< n; i++)
        {
            h[i] = sc.nextInt();
            a[i] = sc.nextInt();
            
            for(int j =0; j<n; j++)
            {
                if(h[i] == a[j])
                {
                    count++;
                }
                if(a[i] == h[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
   
}
}
