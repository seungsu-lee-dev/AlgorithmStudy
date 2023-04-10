import java.io.*;

public class BOJ_24263 {
	public void algorithmNum2Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		int n = Integer.parseInt(inputStr);
		
		// 시간 복잡도 : O(n)
		bw.write(String.valueOf(n));
		bw.newLine();
		bw.write(String.valueOf(1));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24263().algorithmNum2Solution();
	}
}