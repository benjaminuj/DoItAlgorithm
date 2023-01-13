package chap06;
import java.util.Scanner;

public class lostedBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] minus = input.split("-");
		int[] plus = new int[minus.length];
		int sum = 0;
		for(int i=0; i< minus.length; i++) {
			if(!minus[i].contains("+")) {
				plus[i] = Integer.parseInt(minus[i]);
				continue;
			}
			String[] temp = minus[i].split("\\+");
			for(int j =0; j<temp.length; j++) {
				sum += Integer.parseInt(temp[j]);
			}
		    plus[i] = sum;
		    sum =0;
		}
		int difference = plus[0];
		for(int i=1; i<plus.length; i++) {
			difference -= plus[i];
		}
		System.out.println(difference);
	}
}
