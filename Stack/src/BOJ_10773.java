import java.io.*;
import java.util.*;

public class BOJ_10773 {
	public void zeroSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList<>();
		
		for (int index = 0; index < K; index++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				int stackSize = stack.size();
				stack.remove(stackSize - 1);
			}
			else {
				stack.add(num);
			}
		}
		if (stack.size() == 0)
			bw.write("0");
		else {
			int numSum = 0;
			for (int index = 0; index < stack.size(); index++) {
				numSum += stack.get(index);
			}
			bw.write(String.valueOf(numSum));
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10773().zeroSolution();
	}
}