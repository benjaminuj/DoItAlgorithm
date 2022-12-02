package chap03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

//public class dnaPassword09 {
//
//	public static void main(String[] args) throws IOException {
//		int answer = 0;
//		int[] alpha = new int[26]; 
//		int[] checkCnt = new int[4];
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int s = Integer.parseInt(st.nextToken());
//		int p = Integer.parseInt(st.nextToken());
//		
//		st = new StringTokenizer(br.readLine());
//		String dna = st.nextToken();
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 0; i<4; i++) {
//			checkCnt[i] = Integer.parseInt(st.nextToken());
//		}
//
//		for(int i=0; i<p; i++) {
//			int ascii = dna.charAt(i);
//			int alphabet = ascii - 65;
//			alpha[alphabet]++; 
//		}
//		int index = -1;
//		while(p+index < dna.length()) {
//		  index++;
//		  if(alpha[0] >= checkCnt[0] && alpha[2] >= checkCnt[1] && alpha[6] >= checkCnt[2] && alpha[19] >= checkCnt[3]) {
//		      answer++;
//		  }
//		  if(p+index < dna.length()) {
//			  int start = dna.charAt(index) -65;
//			  alpha[start]--;
//			  int end = dna.charAt(p+index) -65;
//			  alpha[end]++;
//		  }
//		}
//		System.out.println(answer);
//	}
//}

public class dnaPassword09 {
	static int checkArr[];
	static int myArr[];
	static int checkSecret;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Result = 0;
		
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i =0 ; i< 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) checkSecret++;
		}
		
		for(int i =0 ;i <P; i++) {
			Add(A[i]);
		}
		if(checkSecret == 4) Result++;
		
		for( int i =P; i<S; i++) {
			int j = i-P;
			Add(A[i]);
			Remove(A[j]);
			if(checkSecret == 4) Result++;
		}
		System.out.println(Result);
		bf.close();
		
	}
	
	private static void Add(char c) {
		switch(c) {
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
	}
	
	private static void Remove(char c) {
		switch(c) {
		case 'A' :
			if(myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C' :
			if(myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G' :
			if(myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T' :
			if(myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
	}
}

