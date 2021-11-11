import java.util.Scanner;
 
public class CancelTheTrains{
	static Scanner sc;
	public static void main(String[] args) {
	    sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while (t-- > 0)
	    	solve();
	    sc.close();
	}
	
	public static void solve() {
		int n, m, i, j;
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int ans = 0;
 
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (i = 0; i < m; i++)
			b[i] = sc.nextInt();
		for (i = 0; i < n; i++)
			for (j = 0; j < m; j++)
				if (a[i] == b[j])
					ans++;
 
		System.out.println(ans);
	}
}