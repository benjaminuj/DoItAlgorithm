package chap03;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class cardGame13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> myQueue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			myQueue.add(i);
		}
		
		while(myQueue.size() > 1) {
			myQueue.poll();
			int frontNum = myQueue.poll();
			myQueue.add(frontNum);
		}
		System.out.println(myQueue.peek());

	}

}
