package chap03;
import java.util.Arrays;
import java.util.Scanner;

//public class average02 {
//	public static String solution(int N, String scores) {
//		String answer;
//		float sum = 0.0f;
//		int[] scoreIntArray = new int[N];
//		
//		String[] scoreStrArray =scores.split(" ");
//		
//		for(int index=0; index < N; index ++) {
//			scoreIntArray[index] = Integer.parseInt(scoreStrArray[index]);
//		}
//		
//		Arrays.sort(scoreIntArray);
//		int max = scoreIntArray[N-1];
//		
//		for(int index=0; index < N; index ++) {
//			int score = scoreIntArray[index];
//			float newScore = (float)score / (float)max * 100.0f;
//			sum += newScore;
//		}
//		float result = sum/N;
//		answer = String.format("%.3f", result);
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int N = scanner.nextInt();
//		String trashValue = scanner.nextLine();
//		String scores = scanner.nextLine();
//		scanner.close();
//		
//		System.out.println(solution(N, scores));
//	}
//}

public class average02 {
	public static float solution(int N, int[] scores) {
		float answer;
		int sum = 0;
		Arrays.sort(scores);
		int max = scores[N-1];
		for(int index=0; index < N; index ++) {
			sum += scores[index];
		}
		answer = sum / max * 100.0f / N;
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] scores = new int[N];
		for(int i =0; i<N; i++) {
			scores[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println(solution(N, scores));
	}
}
