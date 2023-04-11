import java.io.*;
import java.util.*;

public class BOJ_2587 {
	public void meanSolution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numSum = 0;
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int index = 0; index < 5; index++) {
			numList.add(Integer.parseInt(br.readLine()));
		}
		
		numList.sort(null);
		
		for (int index = 0; index < 5; index++) {
			numSum += numList.get(index);
		}
		
		bw.write(String.valueOf(numSum/5));
		bw.newLine();
		bw.write(String.valueOf(numList.get(2)));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_2587().meanSolution();
	}
}