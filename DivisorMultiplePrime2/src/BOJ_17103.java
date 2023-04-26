import java.io.*;
import java.util.*;

public class BOJ_17103 {
	public void partitionSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] nArr = new int[T];
		ArrayList<Integer> sortedArr = new ArrayList<>();
		
		for (int index = 0; index < T; index++) {
			nArr[index] = Integer.parseInt(br.readLine());
			sortedArr.add(nArr[index]);
		}
		
		Collections.sort(sortedArr);
		
		boolean[] isPrime = new boolean[sortedArr.get(T-1)+1];
		isPrime[1] = true;
		for (int index = 2; index < sortedArr.get(T-1)+1; index++) {
			if(!isPrime[index]) {
				for (int j = 2; index * j <= sortedArr.get(T-1); j++) {
					isPrime[index * j] = true;
				}
			}
		}
		
		int[] cntArr = new int[T];
		HashSet<Integer> primeSet = new HashSet<>();
		for (int index = 2; index <= sortedArr.get(T-1); index++) {
			if(!isPrime[index]) {
				primeSet.add(index);
			}
		}
		
		for (int index = 0; index < T; index++) {
			int cnt = 0;
			Iterator iter = primeSet.iterator();
			while (iter.hasNext()) {
				if (primeSet.contains(nArr[index] - (int)iter.next())) {
					cnt++;
				}
			}
			if (cnt % 2 == 0)
				cnt = cnt / 2;
			else
				cnt = cnt / 2 + 1;
			cntArr[index] = cnt;
		}

		for (int index = 0; index < T; index++) {
			bw.write(String.valueOf(cntArr[index]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_17103().partitionSolution();
	}
}