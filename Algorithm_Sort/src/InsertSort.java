import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertSort {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int data[] = new int[6]; // 6개의 데이터 입력
		int key;// 기준값 저장소
		int j;

		for (int k = 0; k < data.length; k++) {
			System.out.print(k + 1 + "번째: ");
			data[k] = Integer.parseInt(in.readLine());
		}
		for (int i = 1; i < data.length; i++) {
			key = data[i];	// 두번째 값을 기준값으로 해놓고
			for (j = i - 1; 0 <= j; j--) {
				if (key < data[j]) {		// 기준값이 바로 앞의 값보다 크면
					data[j + 1] = data[j];		// j의 위치로 밀어넣는다
				} else {
					break;		// 만족하지 않을때는 1단계의 포문만 스탑
				}
			}
			data[j + 1] = key;		// 그럴경우는 원래자리에 기준값을 다시 집어넣는다.
		}
		for (int k = 0; k < data.length; k++) {
			System.out.print(data[k] + " "); // 출력
		}
	}
}