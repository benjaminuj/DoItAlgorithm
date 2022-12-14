//package chap03;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class goodNumber08 {
//	public static int solution(long[] A,int N) {
//		int answer = 0;
//		for(int i =0; i<N; i++) {
//			int end = N-1;
//			int start = 0;
//			while(end>start) {
//				long sum = A[start] + A[end];
//				if( sum > A[i] ) end-- ;
//				else if( sum < A[i]) start++ ;
//				else if( sum == A[i]) {
//					if(start != i && end != i) {
//		              answer++;
//		              break;
//					} else if(start == i) start ++;
//					else if(end ==i) end--;
//		        }
//			}
//		}
//		return answer;
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		StringTokenizer st= new StringTokenizer(br.readLine());
//		long[] A = new long[N];
//		for(int i =0; i <N; i++) {
//			A[i] = Long.parseLong(st.nextToken());
//		}
//		br.close();
//		Arrays.sort(A);
//		System.out.println(solution(A, N));
//	}
//}

package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class goodNumber08 {
	public static int solution(long[] A,int N) {
		int answer = 0;
		for(int i=0; i<N; i++) {
			int start = 0;
			int end = N-1;
			while(start < end) {
				long sum = A[start] + A[end];
				if(sum > A[i]) end--;
				else if(sum < A[i]) start++;
				else if(sum == A[i]) {
					if(start != i && end != i) {
						answer++;
						break;
					}else if(start == i) {
						start++;
					}else if(end == i) {
						end--;
					}
				} 
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		long[] A = new long[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		bf.close();
		Arrays.sort(A);
		System.out.println(solution(A,N));
	}
}
