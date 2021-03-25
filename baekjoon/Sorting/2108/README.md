# 2108 통계학

## 문제 주소
https://www.acmicpc.net/problem/2108

## 문제 풀이 방법
* Counting Sort
    * 입력 데이터가 최대 500,000개이기 때문에 BufferedReader를 사용하여 입력받는 시간을 단축시켰다.
    * 입력 데이터의 범위가 -4000 ~ 4000으로 크지 않으니 Counting Sort를 사용했다.
    * 최빈값의 조건을 만족하기 위해 flag를 사용했다.
     ```java
      // 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
      if(arr[i] > mode_max) { // 최초 최빈값
        mode_max = arr[i];
        mode = i - 4000;
        mode_flag = true;
      }
      else if(arr[i] == mode_max && mode_flag) {	// 최초로 중복된 최빈값
        mode = i - 4000;
        mode_flag = false;
      }
     ```

## 성능
* Counting Sort
  * 메모리 : 41108 KB
  * 시간 : 332 ms
  * 코드길이 : 1545 B
  
***
for문의 횟수를 줄이기 위해서 같은 조건으로 수행되는 연산들은 묶어서 순회시키는 것을 항상 생각하면서 코드를 짜야겠다.
       
