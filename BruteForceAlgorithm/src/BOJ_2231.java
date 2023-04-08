import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2231 {
	public void digitSumSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		int n = Integer.parseInt(inputStr);

		int num = 1;
		int length = 0;
		String numStr = "";
		
		// idea: 1) 문자열을 한 글자씩 쪼개서 더하기 2) 나누기, 나머지 연산으로 각 자리 수 구하기
		while (true) {
			int tempSum = num;
			numStr = Integer.toString(num);
						
			length = numStr.length();
			int result = 0;
			int modResult = num;
			
			for (int index = length - 1; index >= 0; index--) {
				// 1번 idea : 각 자리를 int로 변환하여 더하되, 아스키 코드 값이므로 '0' 값을 뺀다
				// result =  (int)(numStr.charAt(index)) - '0';
				// 2번 idea : 10의 거듭제곱으로 나누기, 나머지 연산하여 각 자리 숫자를 구한다
				result = modResult / (int) (Math.pow(10, index));
				tempSum += result;
				modResult = num % (int) (Math.pow(10,index));
			}
			
			// 분해합이 n과 같아지면 break하여 while에서 탈출
			if(tempSum == n) {
				bw.write(String.valueOf(num));
				break;
			}
			num++;
			if(num == 1000000) {
				bw.write(String.valueOf(0));
				break;
			}
		}		
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_2231().digitSumSolution();
	}
}