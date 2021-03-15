import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_2750_SelectSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		// 선택 정렬
		for(int i = 0; i < (N - 1); i++) {
			for(int j = (i + 1); j < N; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int n : arr) {
			sb.append(n).append('\n');
		}
		System.out.print(sb);
		
	}

}