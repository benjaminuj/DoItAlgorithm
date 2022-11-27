package chap03;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//import java.io.IOException;

//public class remainderSum05 {
//
//	public static void main(String[] args) throws IOException {
//		ArrayList<Integer> a = new ArrayList<>();
//		ArrayList<Integer> sumArr = new ArrayList<>();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int answer = 0;
//		a.add(0);
//		sumArr.add(0);
//		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 1; i<N+1; i++) {
//			a.add(Integer.parseInt(st.nextToken()));
//		}
//		
//		for(int i = 1; i< N+1; i++) {
//			int temp = sumArr.get(i-1) +a.get(i);
//			sumArr.add(temp);
//		}
//		
//		for(int i = 1; i< N+1; i++) {
//			for(int j = 1; j < sumArr.size(); j++) {
//		    	if(sumArr.get(j) % M ==0) answer++;
//			}
//		    int removeValue = sumArr.remove(1); 
//		    for(int j = 1 ; j < sumArr.size(); j++) {
//		    	int before = sumArr.get(j);
//		    	int after = before - removeValue;
//		    	sumArr.set(j, after);
//		    }
//		}
//		System.out.println(answer);
//	}
//}

import java.util.Scanner;
import java.io.IOException;

public class remainderSum05 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		
		S[0] = sc.nextInt();
		for(int i =1; i<N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for(int i =0; i<N; i++) {
			int remainder = (int)S[i] % M;
			if(remainder == 0) answer++;
			C[remainder]++;
		}
		for(int i =0 ;i<M; i++) {
			if(C[i]>1) {
				answer = answer + (C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(answer);
	}
}
