import java.io.*;
import java.util.*;

public class BOJ_10814 {
	public void ageSort() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Info> memberList = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			StringTokenizer memberStr = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(memberStr.nextToken());
			String name = memberStr.nextToken();
			memberList.add(new Info(age, name));
		}
		
		Collections.sort(memberList, new Comparator<Info>() {
			@Override
			public int compare(Info o1, Info o2) {
				return o1.age - o2.age;
			}
		});
		
		for (int index = 0; index < N; index++) {
			bw.write(String.valueOf(memberList.get(index).age));
			bw.write(" ");
			bw.write(String.valueOf(memberList.get(index).name));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10814().ageSort();
	}
}
class Info {
	int age;
	String name;
	
	public Info(int age, String name) {
		this.age = age;
		this.name = name;
	}
}