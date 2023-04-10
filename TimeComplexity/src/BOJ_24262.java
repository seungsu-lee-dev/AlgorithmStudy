import java.io.*;

public class BOJ_24262 {
	public void algorithmNum1Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		int n = Integer.parseInt(inputStr);
		
		// 시간 복잡도 : O(1)
		bw.write(String.valueOf(1) + "\n" + String.valueOf(0));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_24262().algorithmNum1Solution();
	}
}