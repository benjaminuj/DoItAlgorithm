package chap03;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
public class stackAscendingSort11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int now = 1;
		int index=0;
		while(index < n) {
			if(arr[index] >= now) {
		    	stack.push(now);
		    	bf.append("+\n");
		        if(arr[index] == now) {
		        	stack.pop();
		        	bf.append("-\n");
		        	index++;
		        }
		    	now++;
			}
			if(index < n) {
				if(arr[index] < now) {
			    	if(stack.peek() == arr[index]) {
			    		stack.pop();
			    		bf.append("-\n");
			    		index++;
			    	}
			        else {
			        	System.out.println("NO");
			        	return;
			        }
			    }
			}	
		}
//		for(int i=0; i<arrList.size(); i++) {
//			System.out.println(arrList.get(i));
//		}
		return;
	}
}
