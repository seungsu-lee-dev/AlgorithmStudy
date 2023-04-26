import java.io.*;

public class BOJ_10872 {
	public void factorialSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int factorialAnswer = 1;
		
		for (int index = 1; index <= N; index++) {
			factorialAnswer *= index;
		}
		
		bw.write(String.valueOf(factorialAnswer));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10872().factorialSolution();
	}
}