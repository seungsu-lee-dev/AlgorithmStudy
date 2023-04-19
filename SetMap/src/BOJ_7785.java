import java.io.*;
import java.util.*;

public class BOJ_7785 {
	public void employeeSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<String> nowEmployee = new HashSet<String>();
		for (int index = 0; index < N; index++) {
			StringTokenizer history = new StringTokenizer(br.readLine());
			String name = history.nextToken();
			String hr = history.nextToken();
			
			if (hr.equals("enter")) {
				nowEmployee.add(name);
			}
			else if (hr.equals("leave")) {
				nowEmployee.remove(name);
			}
		}
		
		ArrayList<String> employee = new ArrayList<>();
		
		for (String e : nowEmployee)
			employee.add(e);
		employee.sort(Comparator.reverseOrder());
		
		for (String n : employee) {
			bw.write(n);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_7785().employeeSolution();
	}
}