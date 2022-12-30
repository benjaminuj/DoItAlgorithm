package chap05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.Arrays;

public class findNumber29 {
public static int[] A;
public static int[] find;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int M = Integer.parseInt(br.readLine());
		find = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			find[i] = Integer.parseInt(st.nextToken());
			bw.write(binarySearch(0,N-1, find[i]) + "\n");
		}
		bw.flush();
		bw.close();
	}
	public static int binarySearch(int start, int end, int target) {
		while (start <= end) {
			int mid = (start + end) /2;
			if(A[mid] == target) return 1;
			else if(A[mid] < target) start = mid+1;
			else end = mid-1;
		}	
		return 0;
	}
}
