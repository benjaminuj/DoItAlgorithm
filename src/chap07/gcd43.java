package chap07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class gcd43 {
static long gcd;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long aLength = Long.parseLong(st.nextToken());
		long bLength = Long.parseLong(st.nextToken());
		euclid(aLength,bLength);
		for(long i=0; i<gcd; i++) {
			bw.write("1");
		}
		bw.flush();
		bw.close();
	}
	public static void euclid(long aLength,long bLength) {
	    long result = aLength%bLength;
	    if(result == 0) gcd = bLength;
	    else euclid(bLength,result);
	}
}
