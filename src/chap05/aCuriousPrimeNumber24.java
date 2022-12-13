package chap05;
import java.util.Scanner;

public class aCuriousPrimeNumber24 {
static int digit =1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		DFS(2,N);
		DFS(3,N);
		DFS(5,N);
		DFS(7,N);
	}
	
	public static void DFS(int number, int N) {
		if(digit == N) {
			if(checkPrimeNumber(number)) {
				System.out.println(number);
				return;
			}
		}
		
		for(int i=1; i<10; i +=2) {
			number = number*10 + i;
			digit++;
			DFS(number, N);
		}
	}
	
	public static boolean checkPrimeNumber(int number) {
		boolean isPrime = true;
		
		return isPrime;
	}

}
