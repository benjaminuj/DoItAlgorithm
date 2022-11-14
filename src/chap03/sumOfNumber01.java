package chap03;

import java.util.Scanner;

public class sumOfNumber01 {
	
	public static int solution(int count, String sNumber) {
		int answer = 0;
		int sum = 0;
		
		for(int index = 0; index < sNumber.length(); index ++) {
			sum += (sNumber.charAt(index) - 48);
		}
		
		answer = sum;
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		String sNumber = scanner.next();		
		System.out.println(solution(count, sNumber));
		scanner.close();
	}
}

