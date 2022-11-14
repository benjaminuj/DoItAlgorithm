package chap05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.IOException;

public class connectionCount {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		for(int i = 1 ;i < n+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0; i< m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			A[u].add(v);
			A[v].add(u);
		}
		int connectionCount = 0;
		for(int i=1; i < n+1; i++) {
			if(!visited[i]) {
				connectionCount++;
				DFS(i);
			}
		}
		System.out.println(connectionCount);	
	}
	
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i : A[v]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
}
