package chap03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;

public class remainderSum05 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> sumArr = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a.add(0);
		sumArr.add(0);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i<N+1; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 1; i< N+1; i++) {
			int temp = sumArr.get(i-1) +a.get(i);
			sumArr.add(temp);
		}

	}

}
