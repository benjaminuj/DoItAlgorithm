package chap04;
import java.util.Scanner;

public class numberSort15 {
	public static int[] solution(int N, int[] intArr) {
		int[] answer = new int[N];
		
		int check = N;
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-1-i; j++) {
				if(intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
		answer = intArr;
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] intArr = new int[N];
		for(int index = 0; index < N ; index++) {
			intArr[index] = sc.nextInt();
		}
		intArr = solution(N, intArr);
		for(int p=0; p<N; p++) {
			System.out.println(intArr[p]);
		}
	}
}


