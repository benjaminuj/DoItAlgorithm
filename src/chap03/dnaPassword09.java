package chap03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class dnaPassword09 {

	public static void main(String[] args) throws IOException {
		int answer = 0;
		int[] alpha = new int[26]; 
		int[] checkCnt = new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String dna = st.nextToken();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<4; i++) {
			checkCnt[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<p; i++) {
			int ascii = dna.charAt(i);
			int index = ascii - 65;
			alpha[index]++; 
		}
	
	}

}
