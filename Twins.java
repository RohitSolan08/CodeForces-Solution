import java.util.Arrays;
import java.util.Scanner;

public class Twins {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int total =0;
        
        int[] arr = new int[n];
        
        for(int i =0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        
            total +=arr[i];
        }
        
        total = total/2;
        Arrays.sort(arr);
        
        int a =0;
        int a1=0;
        
        for(int i =n-1; i>0;i--)
        {
            a1 += arr[i];
            if(a1>total)
            {
                break;
            }
            else
            {
                a++;
            }
        }
        
        System.out.println(a+1);

   
}
}
