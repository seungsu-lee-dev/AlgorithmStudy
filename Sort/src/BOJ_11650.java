import java.io.*;
import java.util.*;

public class BOJ_11650 {
	public void xySolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<int[]> xyList = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			StringTokenizer xyStr = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(xyStr.nextToken());
			int y = Integer.parseInt(xyStr.nextToken());
			xyList.add(new int[] {x, y});
		}
		
		Collections.sort(xyList, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])
					return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
		});
		
		for (int index = 0; index < N; index++) {
            bw.write(String.valueOf(xyList.get(index)[0]));
            bw.write(" ");
            bw.write(String.valueOf(xyList.get(index)[1]));
            if (index != N-1)
				bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_11650().xySolution();
	}
}