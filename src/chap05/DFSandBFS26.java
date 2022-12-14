package chap05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class DFSandBFS26 {
static boolean[] visited;
static ArrayList<Integer>[] A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		visited = new boolean[N+1];
		A = new ArrayList[N+1];
		for(int i=1; i<N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			A[start].add(end);
			A[end].add(start);
		}
		
		for(int i=1; i<N+1; i++) {
			Collections.sort(A[i]);
		}
		
		DFS(V);
		System.out.println();
		visited = new boolean[N+1];
		BFS(V);
		System.out.println();
	}
	
	public static void DFS(int V) {
		System.out.print(V + " ");
		visited[V] = true;
		for(int i : A[V]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	public static void BFS(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		visited[V] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now + " ");
			for(int i : A[now]) {
				if(!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
