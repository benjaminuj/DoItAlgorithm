package chap07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class lcm42 {
static int gcd;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			euclid(a,b);
			int answer= 0 ;
			answer = (a*b)/gcd;
		    System.out.println(answer);
		}

	}
	public static void euclid(int a, int b) {
		if(a<b) {
	    	int temp = a;
	    	a = b;
	    	b = temp;
	    }
		int result = a%b;
	    if(result == 0) gcd = b;
	    else euclid(b,result);
	}
}
