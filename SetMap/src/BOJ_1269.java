import java.io.*;
import java.util.*;

public class BOJ_1269 {
	public void differenceSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer abStr = new StringTokenizer(br.readLine());
		
		int aCnt = Integer.parseInt(abStr.nextToken());
		int bCnt = Integer.parseInt(abStr.nextToken());
		
		Set<Integer> aSet = new HashSet<>();
		Set<Integer> bSet = new HashSet<>();
		int differenceCnt = 0;
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		for (int index = 0; index < aCnt; index++) {
			aSet.add(Integer.parseInt(a.nextToken()));
		}
		StringTokenizer b = new StringTokenizer(br.readLine());
		for (int index = 0; index < bCnt; index++) {
			bSet.add(Integer.parseInt(b.nextToken()));
		}
		Iterator<Integer> aIt = aSet.iterator();
		Iterator<Integer> bIt = bSet.iterator();
		for (int index = 0; index < bCnt; index ++) {
			if (!aSet.contains((bIt.next())))
				differenceCnt++;
		}
		for (int index = 0; index < aCnt; index ++) {
			if (!bSet.contains((aIt.next())))
				differenceCnt++;
		}
		bw.write(String.valueOf(differenceCnt));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1269().differenceSolution();
	}
}