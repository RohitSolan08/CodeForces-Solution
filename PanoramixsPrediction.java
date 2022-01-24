
import java.util.Scanner;

public class PanoramixsPrediction
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int m=z.nextInt();
        int a=0;
        for (int i=n+1;i<=500;i++) {
            int x=0;
            for(int j=2;j<=i/2;j++) {
                if(i%j==0)
                    x++;
            }
            if(x==0) {
                if(i==m) {
                    System.out.println("YES");
                    break;
                } else {
                    System.out.println("NO");
                    break;
                }
            }  
        }
    }
}