import java.io.*;
import java.util.*;

public class BOJ_4134 {
	public void nextPrimeSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCaseCnt = Integer.parseInt(br.readLine());
		
		for (int index = 0; index < testCaseCnt; index++) {
			bw.write(String.valueOf(new Prime().getPrime(Long.parseLong(br.readLine()))));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_4134().nextPrimeSolution();
	}
}
class Prime {
	long a;
	public long getPrime(long a) {
		if (a <= 2)
			return 2;
		while (true) {
			boolean isPrime = true;
			for (int index = 2; index <= Math.sqrt(a); index++) {
				if (a % index == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				return a;
			a++;
		}
	}
}