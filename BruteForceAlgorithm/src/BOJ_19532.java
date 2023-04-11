import java.io.*;

public class BOJ_19532 {
	public void xySolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputStr = br.readLine().split(" ");
		int[] num = new int[inputStr.length];
		
		for (int index = 0; index < inputStr.length; index++) {
			num[index] = Integer.parseInt(inputStr[index]);
		}
		
		int x = 0;
		int y = 0;
		
		if (num[0] == 0) {
			y = num[2] / num[1];
			x = (num[5] - num[4] * y) / num[3];
		}
		else if (num[1] == 0) {
			x = num[2] / num[0];
			y = (num[5] - num[3] * x) / num[4];
		}
		else if (num[3] == 0) {
			y = num[5] / num[4];
			x = (num[2] - num[1] * y) / num[0];
		}
		else if (num[4] == 0) {
			x = num[4] / num[3];
			y = (num[2] - num[0] * x) / num[1];
		}
		else {
			y = (num[2] * num[3] - num[5] * num[0]) / (num[1] * num[3] - num[4] * num[0]);
			x =  (num[2] - num[1] * y) / num[0];
		}
		bw.write(String.valueOf(x));
		bw.write(" ");
		bw.write(String.valueOf(y));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_19532().xySolution();
	}
}