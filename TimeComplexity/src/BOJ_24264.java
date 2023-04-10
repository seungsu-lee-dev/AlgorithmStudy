import java.io.*;

public class BOJ_24264 {
	public void algorithmNum3Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		// 제곱 시 int 범위 초과하여 long 자료형 사용
		long n = Integer.parseInt(inputStr);
		
		// 시간 복잡도 : O(n²)
		bw.write(String.valueOf(n*n));
		bw.newLine();
		bw.write(String.valueOf(2));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24264().algorithmNum3Solution();
	}
}