package chap05;
import java.util.Scanner;

public class aCuriousPrimeNumber24 {
static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
	}
	public static void DFS(int number, int digit) {
		if(digit== N) {
			if(checkPrimeNumber(number)) {
				System.out.println(number);
			}
			return;
		}
		for(int i = 1; i<10; i = i+2) {
			number = number*10 + i;
			if(checkPrimeNumber(number)) {
				DFS(number, digit+1);
			}
		}
	}
	
	public static boolean checkPrimeNumber(int number) {
		boolean isPrime = true;
		for(int j=2; j<=number/2; j++) {
			if(number%j == 0) {
				isPrime = false;

			}
		}
		return isPrime;
	}

}
