import java.io.*;
import java.util.*;

public class BOJ_1764 {
	public void strangerSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer nmStr = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(nmStr.nextToken());
		int M = Integer.parseInt(nmStr.nextToken());
		
		Set<String> noListened = new HashSet<>();
		ArrayList<String> stranger = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			noListened.add(br.readLine());
		}
		
		for (int index = 0; index < M; index++) {
			String noSeen = br.readLine();
			if (noListened.contains(noSeen))
				stranger.add(noSeen);
		}
		
		Collections.sort(stranger);
		
		bw.write(String.valueOf(stranger.size()));
		for (int index = 0; index < stranger.size(); index++) {
			bw.newLine();
			bw.write(stranger.get(index));
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1764().strangerSolution();
	}
}