package chap03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

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
		
		Deque<Node> checkDeque = new LinkedList<>();
		
	
		
	}
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
