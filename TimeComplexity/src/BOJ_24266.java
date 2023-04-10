import java.io.*;

public class BOJ_24266 {
	public void algorithmNum5Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		// 세제곱 시 int 범위 초과하여 long 자료형 사용
		long n = Long.parseLong(inputStr);
		
		// 시간 복잡도 : O(n³)
		bw.write(String.valueOf(n*n*n));
		bw.newLine();
		bw.write(String.valueOf(3));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24266().algorithmNum5Solution();
	}
}