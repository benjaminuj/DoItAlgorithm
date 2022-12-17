package chap05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class mazeSearch27 {
static char[][] A;
static Integer[][] depth;
static int[] dy = {1,0,-1,0};
static int[] dx = {0,1,0,-1};
static int N;
static int M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new char[N][M];
		depth = new Integer[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				depth[i][j] =0;
			}
		}
		for(int i=0; i<N; i++) {
			A[i] = br.readLine().toCharArray();
		}
		
		System.out.println(BFS(0,0));
	}
	public static int BFS(int y, int x) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {y,x});
		depth[y][x] = 1;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			for(int i=0; i<4; i++) {
				int nextY = now[0] + dy[i];
				int nextX = now[1] + dx[i];
			
				if(0 <= nextX && 0 <= nextY && nextX < M && nextY < N ) {
					if(depth[nextY][nextX] == 0 && A[nextY][nextX] == '1') {
						queue.add(new int[] {nextY, nextX});
						depth[nextY][nextX] = depth[now[0]][now[1]] +1;
					}
				}
			}
		}
		return depth[N-1][M-1];
	}
}
