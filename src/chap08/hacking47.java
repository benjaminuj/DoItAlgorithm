package chap08;
import java.util.*;
import java.io.*;

public class hacking47 {
static ArrayList<Integer>[] info;
static int[] visited;
static int severalMax;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> answer = new ArrayList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int max = 0;
		info = new ArrayList[N+1];
		for(int i=1; i<N+1; i++) {
			info[i] = new ArrayList<>();
		}
		visited = new int[N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			info[B].add(A);
		}
		for(int i=1; i<N+1; i++) {
			severalMax = 1;
			int canHackingCount = BFS(i);
			if(max == canHackingCount) {
				answer.add(i);
			}
			else if(max < canHackingCount) {
				answer.clear();
				answer.add(i);
				max = canHackingCount;
			}
			for(int j=0; j<N+1; j++) {
				visited[j] =0;
			}
		}
		for(int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(i)+ " ");
		}
	}
	
	public static int BFS(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			int nowComputer = queue.poll();
			for(int nearComputer : info[nowComputer]) {
				if(visited[nearComputer] == 0) {
					queue.add(nearComputer);
					severalMax++;
				}
			}
		}
		return severalMax;
	}
}
