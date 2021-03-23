package bj_210111;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_2751_SelectSort2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		boolean[] counting = new boolean[2000001];	//숫자 범위 -1000000 ~ 1000000
		
		for(int i = 0; i < T; i++) {	//counting 할당
			counting[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		br.close();
		
		for(int j = 0; j < counting.length; j++) {
			if(counting[j]) {
				sb.append(j - 1000000).append('\n');
			}
		}
		
		System.out.print(sb);
	}

}