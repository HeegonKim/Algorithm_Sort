import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	public static final int MAX = 6;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] data = new int[MAX];
		int temp;

		for (int i = 0; i < data.length; i++) {
			System.out.print(i + 1 + "번째 수: ");
			data[i] = Integer.parseInt(in.readLine());
		}
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];		//스왑
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
