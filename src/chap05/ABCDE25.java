package chap05;
import java.util.ArrayList;
import java.util.Scanner;

public class ABCDE25 {
static ArrayList<Integer>[] freind;
static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		freind = new ArrayList[N];
		for(int i =0; i<N; i++) {
			freind[i] = new ArrayList<>();
		}
		sc.nextLine();
		for(int i =0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		    freind[a].add(b);
		    freind[b].add(a);
		    sc.nextLine();
		}
		visited = new boolean[N];
		for(int i =0; i<N; i++) {
			int answer = DFS(i,1);
			if(answer == 1) {
		    	System.out.println("1");
		        return;
		    }
			for(int j=0; j<N; j++) {
				visited[j] = false;
			}
		}
		System.out.println("0");
		return;
	}
	public static int DFS(int person,int depth){
	    if(depth == 5) {
	    	return 1;
	    }
	    visited[person] = true;
	    for(int i : freind[person]) {
	    	if(!visited[i]) {
	    		DFS(i,depth+1);
	        }
	    }
	    visited[person] = false;
	    return 0;
	}
}

//public class ABCDE25 {
//static ArrayList<Integer>[] freind;
//static boolean[] visited;
//static boolean arrive;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		arrive =false;
//		freind = new ArrayList[N];
//		for(int i =0; i<N; i++) {
//			freind[i] = new ArrayList<>();
//		}
//		sc.nextLine();
//		for(int i =0; i<M; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//		    freind[a].add(b);
//		    freind[b].add(a);
//		    sc.nextLine();
//		}
//		visited = new boolean[N];
//		for(int i =0; i<N; i++) {
//			DFS(i,1);
//			if(arrive) break;
//		}
//		if(arrive) System.out.println("1");
//		else System.out.println("0");
//	}
//	public static void DFS(int person,int depth){
//	    if(depth == 5 || arrive) {
//	    	arrive =true;
//	    	return;
//	    }
//	    visited[person] = true;
//	    for(int i : freind[person]) {
//	    	if(!visited[i]) {
//	    		DFS(i, depth+1);
//	        }
//	    }
//	    visited[person] = false;
//	}
//}
