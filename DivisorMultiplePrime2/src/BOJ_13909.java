import java.io.*;

public class BOJ_13909 {
	public void windowSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int num = 1;
		
		while (Math.pow(num, 2) <= N) {
			num++;
		}
		
		bw.write(String.valueOf(num - 1));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_13909().windowSolution();
	}
}