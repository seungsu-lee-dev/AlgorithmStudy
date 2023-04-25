import java.io.*;

public class BOJ_2485 {
	public void roadTreeSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int first = 0;
		int last = 0;
		int[] tree = new int[N-1];
		int prevTree = 0;
		for (int index = 0; index < N; index++) {
			int num = Integer.parseInt(br.readLine());
			if (index == 0)
				first = num;
			if (index == N - 1)
				last = num;
			if (index != 0) {
				tree[index -1 ] = num - prevTree;
			}
			prevTree = num;
		}
		int num = tree[0];
		for (int index = 1; index < tree.length; index++) {
			num = new G().getG(num, tree[index]);
		}
		int minTreeNum = (last - first) / num - (N - 1);
		bw.write(String.valueOf(minTreeNum));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_2485().roadTreeSolution();
	}
}

class G {
	int a, b;
	public int getG(int a, int b) {
		while (b != 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
}