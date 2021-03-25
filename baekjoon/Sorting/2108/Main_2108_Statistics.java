package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2108_Statistics {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8001];	//입력값 -4000 ~ 4000
		int sum = 0;
		int max = -5000;
		int min = 5000;
		
		for(int i = 0; i < N; i++) {
			int val = Integer.parseInt(br.readLine());
			sum += val;
			arr[val + 4000]++;	//값은 i, 빈도는 arr[i]
			
			if(val > max) {
				max = val;
			}
			
			if(val < min) {
				min = val;
			}
		}
		br.close();
		
		int mean = (int)Math.round((double)sum / N);	//산술평균
		int median = 5000;	//중앙값
		int mode = 5000;	//최빈값
		int range= max - min;	//범위
		
		int cnt = 0;	//중앙값 카운팅
		int mode_max = 0;	//최빈값의 최댓값
		boolean mode_flag = false;	//최초로 최빈값이 나오면 true
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				
				if(cnt < (N + 1) / 2) {	//중앙값 = (N - 1) / 2
					cnt += arr[i];
					median = i - 4000;
				}
				
				if(arr[i] > mode_max) {//최초 최빈값
					mode_max = arr[i];
					mode = i - 4000;
					mode_flag = true;
				}
				else if(arr[i] == mode_max && mode_flag) {	//최초로 중복된 최빈값
					mode = i - 4000;
					mode_flag = false;
				}
			}
		}
		
		System.out.println(mean);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}

}