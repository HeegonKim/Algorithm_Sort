import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int row;	// 선택 대상
		int col;		// 비교 대상
		int temp;
		int cup;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int data[] = new int[6]; // 6개의 데이터 입력

		for (int k = 0; k < data.length; k++) {
			System.out.print(k + 1 + "번째: ");
			data[k] = Integer.parseInt(in.readLine());
		}
		
		for(row=0;row<data.length-1;row++){
			temp = row;
			for(col=row+1;col<data.length;col++){
				if(data[temp]>data[col]){
					temp = col;
				}
			}

			cup = data[row];
			data[row]=data[temp];
			data[temp]=cup;

			for(col=0;col<data.length;col++){
			System.out.printf("%3d", data[col]);
			}
			System.out.println();
		}
	}
}

/*
 * 임시 공간(S)을 만들어서 교환이 필요한 경우에 임시 공간(S)에 교환 할 위치를 저장한다. 임시 공간(S)에 들어있는 값과 그 다음값을
 * 계속 비교해나간다. 최종적으로 가장 작은 값이 그 자리에 온다. 자신과 비교해서 작은 문자가 나타날 때마다 계속 교환하는 것에 비해서
 * 아무리 비교할 대상이 많다고 하더라도 교환은 한 번만 일어나기 때문에 성능의 향상을 가져올 수 있음.
 */
