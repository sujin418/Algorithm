package bj_210111;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_10989_SelectSort3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] counting = new int[10001];	//숫자 범위 : 1 ~ 10000
		int[] result = new int[N];
		
		for(int i = 0; i < N; i++) {	//arr 할당
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		for(int a : arr) {	//counting 할당
			counting[a]++;
		}
		
		for(int j = 1; j < counting.length; j++) {	//counting 누적합 만들기
			counting[j] += counting[j - 1];
		}
		
		for(int k = N - 1; k >= 0; k--) {	//정렬하기
			int val = arr[k];
			counting[val]--;
			result[counting[val]] = val;
		}
		
		for(int b : result) {
			sb.append(b).append('\n');
		}
		
		System.out.print(sb);
	}

}