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
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}

	}

}
