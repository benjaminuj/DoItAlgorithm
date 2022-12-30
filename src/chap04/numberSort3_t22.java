//package chap04;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Queue;
//import java.util.StringTokenizer;
//import java.util.LinkedList;
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
//
//public class numberSort3_t22 {
//static int[] number;
//static Queue<Integer> queueZero = new LinkedList<>();
//static Queue<Integer> queueOne = new LinkedList<>();
//static Queue<Integer> queueTwo = new LinkedList<>();
//static Queue<Integer> queueThree = new LinkedList<>();
//static Queue<Integer> queueFour = new LinkedList<>();
//static Queue<Integer> queueFive = new LinkedList<>();
//static Queue<Integer> queueSix = new LinkedList<>();
//static Queue<Integer> queueSeven = new LinkedList<>();
//static Queue<Integer> queueEight = new LinkedList<>();
//static Queue<Integer> queueNine = new LinkedList<>();
//static int n =0;
//
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(br.readLine());
//		number = new int[N];
//		for(int i=0; i<N; i++) {
//			number[i] = Integer.parseInt(br.readLine());
//		}
//		
//		radixSort(number);
//		for(int i=0; i<N; i++) {
//			bw.write(number[i] +"\n");
//		}
//		bw.flush();
//		bw.close();
//	}
//	
//	public static void radixSort(int[] number) {
//		while(n <= 4) {
//			for(int num : number) {
//				try {
//					int placeValue = num/(10^n);
//					switch(placeValue) {
//						case 0 : 
//							queueZero.add(num);
//							break;
//						case 1 : 
//							queueOne.add(num);
//							break;
//						case 2 : 
//							queueTwo.add(num);
//							break;
//						case 3 : 
//							queueThree.add(num);
//							break;
//						case 4 : 
//							queueFour.add(num);
//							break;
//						case 5 : 
//							queueFive.add(num);
//							break;
//						case 6 : 
//							queueSix.add(num);
//							break;
//						case 7 : 
//							queueSeven.add(num);
//							break;
//						case 8 : 
//							queueEight.add(num);
//							break;
//						case 9 : 
//							queueNine.add(num);
//							break;
//					}
//				}catch(ArithmeticException e) {
//					queueZero.add(num);
//				}
//			}
//			
//			n++;
//		}
//		
//	}
//
//}

package chap04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class numberSort3_t22 {
public static int[] A;
public static long result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Radix_Sort(A, 5);
		for(int i=0 ;i<N; i++) {
			bw.write(A[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void Radix_Sort(int[] A, int max_size) {
		int[] output = new int[A.length];
		int jarisu = 1;
		int count = 0;
		while(count != max_size) {
			int[] bucket = new int[10];
			for(int i=0; i<A.length; i++) {
				bucket[(A[i]/jarisu) % 10]++;
			}
			
			for(int i=1; i<10; i++) {
				bucket[i] += bucket[i-1];
			}
			
			for(int i= A.length-1; i>= 0; i--) {
				output[bucket[(A[i]/jarisu  % 10)] -1] = A[i];
				bucket[(A[i] / jarisu % 10)]--;
			}
			
			for(int i=0; i<A.length; i++) {
				A[i] = output[i];
			}
			jarisu *= 10;
			count++;
		}
	}
}

	
