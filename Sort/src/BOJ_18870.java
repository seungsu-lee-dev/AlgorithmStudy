import java.io.*;
import java.util.*;

// 스스로 풀지 못한 문제
public class BOJ_18870 {
	public void xyZip() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] xArr = new int[N];
		ArrayList<Integer> newX = new ArrayList<>();
		
		StringTokenizer xStr = new StringTokenizer(br.readLine());
		for (int index = 0; index < N; index++) {
			xArr[index] = Integer.parseInt(xStr.nextToken());
			newX.add(xArr[index]);
		}
		
		Collections.sort(newX);
		
		HashMap<Integer, Integer> xMap = new HashMap<>();
		int position = 0;
		
		for (int index = 0; index < N; index++) {
			if (!xMap.containsKey(newX.get(index))) {
				xMap.put(newX.get(index), position);
				position++;
			}
		}
		
		for (int index = 0; index < N; index++) {
			bw.write(String.valueOf(xMap.get(xArr[index])));
			bw.write(" ");
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_18870().xyZip();
	}
}