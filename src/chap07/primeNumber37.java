package chap07;
import java.util.Scanner;
import java.util.ArrayList;

public class primeNumber37 {
static int N;
static int M;
static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		A = new int[N+1];
		for(int i=2; i<=N; i++) {
			A[i] =i;
		}
	
		primeNumber();
		for(int i=M; i<=N; i++) {
			if(A[i] != 0) {
				System.out.println(A[i]);
			}
		}
	}
	public static void primeNumber() {
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(A[i] ==0) {
				continue;
			}
			for(int j=2*i; j<=N; j= i+j) {
				A[j] =0;
			}
		}
	}
}
