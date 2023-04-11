import java.io.*;
import java.util.*;

public class BOJ_25305 {
	public void cutLineSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputStr = br.readLine().split(" ");
		int N = Integer.parseInt(inputStr[0]);
		int k = Integer.parseInt(inputStr[1]);
		
		String[] studentStr = br.readLine().split(" ");
		
		ArrayList<Integer> studentList = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			studentList.add(Integer.parseInt(studentStr[index]));
		}
		
		studentList.sort(Comparator.reverseOrder());
		
		bw.write(String.valueOf(studentList.get(k-1)));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_25305().cutLineSolution();
	}
}