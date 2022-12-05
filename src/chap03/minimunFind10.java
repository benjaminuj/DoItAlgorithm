package chap03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class minimunFind10 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(bf.readLine());
		for(int i =0 ; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i =0 ; i<N; i++) {
			System.out.println(A[i]);
		}
		
	}
}
