import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2798 {
	public void blackJackSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 첫째 줄 입력 값 저장 - 카드 개수(N), M
		String[] countStr = br.readLine().split(" ");
		int[] countArr = new int[countStr.length];
		
		for (int index = 0; index < countStr.length; index++) {
			countArr[index] = Integer.parseInt(countStr[index]);
		}

		// 둘째 줄 입력 값 저장 - 카드 숫자
		String[] numberStr = br.readLine().split(" ");
		int[] numberArr = new int[numberStr.length];

		for (int index = 0; index < numberStr.length; index++) {
			numberArr[index] = Integer.parseInt(numberStr[index]);
		}
		
		// 최종 출력할 정답
		int answer = 0;
		// 카드 3장 합을 임시로 저장
		int cardSum = 0;
		
		// idea : 답이 나올 때까지 카드 3장을 순서대로 무작정 더하는 방법
		for (int i = 0; i < countArr[0] - 2; i++) {
			for (int j = i + 1; j < countArr[0] - 1; j++) {
				for (int k = j + 1; k < countArr[0]; k++) {
					cardSum = numberArr[i] + numberArr[j] + numberArr[k];
					
					// 카드 3장 합이 M 이하일 때, 저장. 카드 합이 저장한 값보다 커질 때마다 저장.
					if ((cardSum <= countArr[1]) && (cardSum > answer)) {
						answer = cardSum;
					}
					
					// M과 같아지는 순간 return 시켜 반복문에서 탈출
					if (answer == countArr[1]) {
						bw.write(String.valueOf(answer));
						bw.flush();
						bw.close();
						return;
					}
				}
			}
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		new BOJ_2798().blackJackSolution();
	}
}