# 10989 수 정렬하기3

## 문제 주소
https://www.acmicpc.net/problem/10989

## 문제 풀이 방법
* Counting Sort
    ```
    1. 중복이 가능하므로 int배열을 이용했다.
    2. 입출력 데이터가 많기 때문에 BufferedReader와 StringBuilder를 사용하여 시간을 단축시켰다.
    ```
* Counting Sort 단축버전
  > 수의 범위를 알고있고, 입출력만 필요할 때 사용한다.
   ```java
    public class Main {
      public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] counting = new int[10001];	//숫자 범위 : 1 ~ 10000

        for(int i = 0; i < N; i++) {	//arr 할당없이 바로 숫자 count
          counting[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for(int j = 1; j < counting.length; j++) {	//counting의 값이 0이 될때까지 출력
          while(counting[j] > 0){
                    sb.append(j).append('\n');
                    counting[j]--;
          }
        }

        System.out.print(sb);
      }
    }
   ```

## 성능
* Counting Sort
  ```
  메모리 : 378828 KB
  시간 : 1788 ms
  코드길이 : 974 B
  ```
* Counting Sort 단축버전
  ```
  메모리 : 336500 KB
  시간 : 1548 ms
  코드길이 : 817 B
  ```
***
앞으로 단축버전을 애용해야겠다.
