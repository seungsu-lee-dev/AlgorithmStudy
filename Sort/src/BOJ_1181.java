import java.io.*;
import java.util.*;

public class BOJ_1181 {
	public void wordSort() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> wordList = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			String word = br.readLine();
			if (!wordList.contains(word))
				wordList.add(word);
		}
		
		wordList.sort(null);
		
		Collections.sort(wordList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		for (int index = 0; index < wordList.size(); index++) {
			bw.write(wordList.get(index));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1181().wordSort();
	}
}