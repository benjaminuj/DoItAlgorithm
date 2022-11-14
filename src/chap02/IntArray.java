package chap02;
import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int samDaily = sc.nextInt();
        int kellyDaily = sc.nextInt();
        int ahead = sc.nextInt();
        
        System.out.println(solution(samDaily,kellyDaily, ahead));
        

    }
    
    public static int solution(int S, int K, int A) {
        int answer = 1;
        int Sinit = A + S;
        int resK = K;
        
        if(K <= S) {
            return -1;
        }
        else {
            while(Sinit >= K) {
                Sinit = Sinit + S;
                resK = resK + K;
                answer ++;
            }
        }
        return answer;
    }

}





