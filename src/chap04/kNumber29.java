//package chap04;
//import java.util.Scanner;
//
//public class kNumber29 {
//static int[] A;
//static int N;
//static int pivot;
//static int start = pivot +1;
//static int end;
//static int index = 0;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		end = N-1;
//		pivot = N/2;
//		A = new int[N];
//		int K = sc.nextInt();
//		sc.nextLine();
//		for(int i=0; i<N; i++) {
//			A[i] = sc.nextInt();   
//		}
//		quickSort(A);
//		System.out.println(A[K]);
//	}
//	public static void quickSort(int[] A) {
//		swap(A[index],A[pivot]);
//	    if(start +1 >= end) return;
//	    if(start >= end) {
//	    	return;
//	    }
//	    if(A[start]> A[pivot] && A[end] < A[pivot]) {
//	    	swap(A[start], A[end]);
//	        end--;
//	        start++;
//	        quickSort(A);
//	    }
//	    if(A[end] < A[pivot]&& A[start] <= A[pivot]) {
//	        start++;
//	        quickSort(A);
//	    }
//	    if(A[start]> A[pivot] && A[end] >= A[pivot]) {
//	    	end--;
//	    	quickSort(A);
//	    }
//	    if(A[start] <= A[pivot] && A[end] >= A[pivot]) {
//	    	start++;
//	    	end--;
//	    	quickSort(A);
//	    }
//	    pivot++;
//	    index++;
//	}
//	
//	public static void swap(int start, int end) {
//		int temp = end;
//		end = start;
//		start = temp;
//	}
//
//}

package chap04;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class kNumber29 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(in.readLine());
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(A,0,N-1,K-1);
		System.out.println(A[K-1]);
	}
	public static void quickSort(int[] A, int S, int E, int K) {
		if(S <E) {
			int pivot = partition(A,S,E);
			if(pivot == K) return;
			else if(K < pivot) quickSort(A,S,pivot-1,K);
			else quickSort(A, pivot+1, E, K);
		}
	}
	
	public static int partition(int[] A, int S, int E) {
		if(S+1 == E) {
			if(A[S] > A[E]) swap(A,S,E);
			return E;
			
		}
		int M = (S+E) /2;
		swap(A,S,M);
		int pivot = A[S];
		int i = S+1 , j = E;
		while(i<=j) {
			while(pivot < A[j] && j>0) {
				j--;
			}
			while(pivot>A[i] && i < A.length-1) {
				i++;
			}
			if(i<=j) {
				swap(A, i++, j--);
			}
		}
		A[S] = A[j];
		A[j] = pivot;
		return j;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}

