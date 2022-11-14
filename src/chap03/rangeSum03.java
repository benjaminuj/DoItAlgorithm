package chap03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class rangeSum03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] rangeSum = new long[N+1];
		
		st = new StringTokenizer(br.readLine());
	
		for(int i=1; i<=N; i++) {
			rangeSum[i] = rangeSum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int index = 0 ;index < M; index ++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			bw.write((rangeSum[j] - rangeSum[i-1]) + "\n");
			bw.flush();
		}
	}
}
