import java.io.*;
import java.util.*;

public class BOJ_1929 {
	public void getPrimeSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer mnStr = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(mnStr.nextToken());
		int N = Integer.parseInt(mnStr.nextToken());
		int temp = 0;
		for (int index = M; index <= N; index++) {
			int primeNum = new Prime2().getPrime(index);
			if (primeNum > N)
				break;
			if (primeNum == temp)
				continue;
			bw.write(String.valueOf(primeNum));
			bw.newLine();
			temp = primeNum;
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1929().getPrimeSolution();
	}
}
class Prime2 {
	int a;
	public int getPrime(int a) {
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