import java.io.*;
import java.util.*;

public class BOJ_10828 {
	public void stackSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			String command = br.readLine();
			
			if (command.contains("push")) {
				stack.add(Integer.parseInt(command.split(" ")[1]));
				continue;
			}
			else if (command.contains("pop")) {
				int stackSize = stack.size();
				try {
					int popNum = stack.get(stackSize - 1);
					stack.remove(stackSize - 1);
					bw.write(String.valueOf(popNum));
				} catch (Exception e) {
					bw.write(String.valueOf(-1));
				}
			}
			else if (command.contains("top")) {
				int stackSize = stack.size();
				try {
					int topNum = stack.get(stackSize - 1);
					bw.write(String.valueOf(topNum));
				} catch (Exception e) {
					bw.write(String.valueOf(-1));
				}
			}
			else if (command.contains("size")) {
				bw.write(String.valueOf(stack.size()));
			}
			else if (command.contains("empty")) {
				bw.write(stack.size() > 0 ? "0" : "1");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10828().stackSolution();
	}
}