import java.io.*;

public class BOJ_24265 {
	public void algorithmNum4Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		// 제곱 시 int 범위 초과하여 long 자료형 사용
		long n = Long.parseLong(inputStr);
		
		// 시간 복잡도 : O(n²) -> nC2 규칙
		bw.write(String.valueOf((n)*(n-1)/2));
		bw.newLine();
		bw.write(String.valueOf(2));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24265().algorithmNum4Solution();
	}
}