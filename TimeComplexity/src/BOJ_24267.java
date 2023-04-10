import java.io.*;

public class BOJ_24267 {
	public void algorithmNum6Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		// 세제곱 시 int 범위 초과하여 long 자료형 사용
		long n = Long.parseLong(inputStr);
		
		// 시간 복잡도 : O(n³) -> nC3 규칙
		bw.write(String.valueOf(n*(n-1)*(n-2)/6));
		bw.newLine();
		bw.write(String.valueOf(3));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24267().algorithmNum6Solution();
	}
}