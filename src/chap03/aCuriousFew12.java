package chap03;
import java.util.Scanner;

public class aCuriousFew12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int number = 1*10^N;
		int lastNumber = 1*10^(N+1)-1;
		for(int i = number; i <= lastNumber ; i++) {
			int index = N-1;
			boolean few = Few(i, N);
		    while(few && index > 0) {
		    	String strNumber = String.valueOf(i);
		        strNumber.substring(0,index);
		        int nextNumber = Integer.parseInt(strNumber);
		        few = Few(nextNumber, N);
		        index--;
		        if(index == 0) {
		        	System.out.println(i);
		        	break;
		        }
		    }
		    i++;
		}
	}
	public static boolean Few(int num, int N) {
		boolean few = true;
		for(int i =2; i < N; i++) {
	    	int remainder = num%i;
	        if(remainder == 0) {
	        	few = false;
	            return few;
	        }
	    }
	    return few;
	}

}
