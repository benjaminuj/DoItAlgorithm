package chap03;
import java.util.Scanner;

public class sumOfConsecutiveNumbers06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 1;
		int end = 1;
		int sum = 1;
		int answer = 1;

		while(end != N) {
			if(N > sum) {
				end ++;
			    sum += end;
			}
			else if( N < sum ) {
				sum -= start;
				start ++;
			}
			else if( N == sum ) {
				answer++;
				end ++;
			    sum += end;
			}
		}
		System.out.println(answer);
	}
}
