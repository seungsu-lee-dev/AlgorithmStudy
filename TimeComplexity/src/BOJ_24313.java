import java.io.*;

public class BOJ_24313 {
	public void bigONotationSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputStr = br.readLine().split(" ");
		int[] a = new int[inputStr.length];
		
		for (int index = 1; index >= 0; index--) {
			a[index] = Integer.parseInt(inputStr[index]);
		}
		
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		if ((a[0] * n + a[1]) <= (c * n))
			answer = 1;
		
		for (int index = n; index < 100; index++) {
			n = index;
			if ((a[0] * n + a[1]) > (c * n)) {
				answer = 0;
				break;
			}
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24313().bigONotationSolution();
	}
}