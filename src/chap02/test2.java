package chap02;

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class test2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
        
		StringBuilder source = new StringBuilder();
		//StringBuilder target = new StringBuilder();
        
        int size = Integer.parseInt(br.readLine());
        int[] order = new int[size];
        
        for(int i=0; i<size; i++) {
        	order[i] = Integer.parseInt(br.readLine());
        }
        String s = br.readLine();
        source.append(s);
        
        /*
        String t = br.readLine();
        target.append(t);
        */
        
        String target = sc.nextLine();
        int result = Solution(order, source, target);
        System.out.println(result);
    }
	
    public static int Solution(int[] order, StringBuilder source, String target) {
        int answer = 0;
        String mch = "";
        
        char[] chars = target.toCharArray();
        for (int i = 0; i < chars.length; i++) {
        	 mch = mch + chars[i] + ".*" ;
        	
        }
        System.out.println(mch);
        
        for(int i=0; i< order.length; i++) {
        	source = source.deleteCharAt(order[i]-1);
        	String temp = source.toString();
        	System.out.println(temp);
        	if (temp.matches(mch) == false) {
        		break;
        	}
        	else
        	{
        		answer++;
        		System.out.println(answer);
        		
        	}
        }
        
        return answer;
    }
}
