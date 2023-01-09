package chap05;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Scanner;

public class findKthNumber31 {
static int N;
static int k;
static int answer =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		k = sc.nextInt();
		System.out.println(binarySearch(1,k)); 
	}
	public static int binarySearch(int start, int end) {
		while(start <= end) {
			int middle = (start + end) /2;
			int sum = 0;
			for(int i=1; i<=N; i++) {
				sum += Math.min(middle/i, N);  
			}
		    if(sum < k) start = middle +1;
		    if(sum >= k) {
		    	end = middle-1;
		        answer = middle;
		    }
		}
		return answer;
	}
}
