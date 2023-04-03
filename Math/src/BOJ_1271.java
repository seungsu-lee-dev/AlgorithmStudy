import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BOJ_1271 {
	public void greatRich2Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] moneyStr = br.readLine().split(" ");
		
		// long 이상의 큰 숫자는 BigInteger 타입 사용
		BigInteger money = new BigInteger(moneyStr[0]);
		BigInteger number = new BigInteger(moneyStr[1]);
		
		// BigInteger 나눗셈 메소드
		bw.write(String.valueOf(money.divide(number)));
		bw.write("\n");
		// BigInteger 나머지 메소드
		bw.write(String.valueOf(money.remainder(number)));
		
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1271().greatRich2Solution();
	}
}
