package chap03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class rangeSum04 {
	static int[][] A;
	static long[][] S;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		A = new int[N+1][N+1];
		S = new long[N+1][N+1];
		
		for(int row =1; row < N+1; row++) {
			st = new StringTokenizer(br.readLine());
			for(int column = 1; column < N+1 ; column++) {
				A[row][column] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int row =1; row < N+1; row++) {
			for(int column=1; column < N+1; column++) {
				S[row][column] = S[row-1][column] + S[row][column-1] - S[row-1][column-1] + A[row][column];
			}
		}
		

	}

}
