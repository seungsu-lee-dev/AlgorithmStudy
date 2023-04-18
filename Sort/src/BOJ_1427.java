import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_1427 {
	public void sortInsideSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		int N = Integer.parseInt(inputStr);
		ArrayList<Integer> nList = new ArrayList<>();
		int tempNum = N;
		
		for (int index = 0; index < inputStr.length(); index++) {
			nList.add(tempNum % 10);
			tempNum /= 10;
		}
		
		nList.sort(Comparator.reverseOrder());
		
		bw.write(nList.stream().map(String::valueOf).collect(Collectors.joining("")));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1427().sortInsideSolution();
	}
}