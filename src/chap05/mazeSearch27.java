package chap05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class mazeSearch27 {
static int[][] A;
static boolean[][] visited;
static int[] dx = {0,1,0,-1};
static int[] dy = {1,0,-1,0};
static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		visited = new boolean[N][M];
		for(int row=0; row<N; row++) {
			st = new StringTokenizer(bf.readLine());
			String line = st.nextToken();
			for(int j=0; j < M; j++) {
				A[row][j] = Integer.parseInt(line.substring(j,j+1));
			}
		}
		BFS(0,0);
		System.out.println(A[N-1][M-1]);
	}
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		visited[i][j] = true;
		while(!queue.isEmpty()) {
			int[] now = queue.poll(); 
			for(int k=0; k<4; k++) {
				int y = now[0] + dy[k];
				int x = now[1] +  dx[k];
				if(0 <= x && x < N && 0 <= y && y < M) {
					if(!visited[x][y] && A[x][y] == 1) {
						visited[i][j] = true;
						A[x][y] = A[now[0]][now[1]] + 1;
						queue.add(new int[] {x,y});
					}
				}
			}
		}
	}
}
