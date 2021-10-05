import java.util.*;
import java.util.Scanner;

public class   DevuTheSingerAndChuruTheJoker{

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int sum =0;
         int answer =0;
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        for(int i =0 ; i< n ; i++)
        {
            int t = sc.nextInt();
            sum = sum +t;
            
        }
         
    int bet = (n-1)*10;
    
    if((sum+bet) > d)
    {
        answer = -1;
    }
    else
    {
        answer = (d-sum)/5;
    }
    System.out.println(answer);
    }
}

