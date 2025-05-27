// 강사님 코드 + 인터넷 참고


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
static int myArr[];
static int checkArr[];
static int checkSecret;

public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st = new StringTokenizer(br.readLine());
  int S = Integer.parseInt(st.nextToken());
  int P = Integer.parseInt(st.nextToken());
  int Result = 0;
  checkArr = new int[4]; // 비밀번호 체크 배열
  myArr = new int[4]; // 현재 상태 배열
  char A[] = new char[S];
  checkSecret = 0; // 부분문자열 중 몇 개를 만족하는지 확인하는 변수

  A = br.readLine().toCharArray();
  st = new StringTokenizer(br.readLine());

  for (int i = 0; i < 4; i++) {
    checkArr[i] = Integer.parseInt(st.nextToken());
    if (checkArr[i] == 0) {
      checkSecret++; // 0이면 이미 만족하기 때문
    }
  }

  for (int i = 0; i < P; i++) { // 부분문자열 처음 받을 때 세팅
    Add(A[i]);
  }

  if (checkSecret == 4)
    Result++;

  // 슬라이딩 윈도우
  for (int i = P; i < S; i++) {
    int j = i - P; // j는 맨 앞, i는 맨 뒤
    Add(A[i]);
    Remove(A[j]);
    if (checkSecret == 4)
      Result++;
  }

  System.out.println(Result);
  br.close();

}

private static void Add(char c) {
  switch (c) {
    case 'A':
      myArr[0]++;
      if (myArr[0] == checkArr[0])
        checkSecret++;
      break;
    case 'C':
      myArr[1]++;
      if (myArr[1] == checkArr[1])
        checkSecret++;
      break;
    case 'G':
      myArr[2]++;
      if (myArr[2] == checkArr[2])
        checkSecret++;
      break;
    case 'T':
      myArr[3]++;
      if (myArr[3] == checkArr[3])
        checkSecret++;
      break;
  }
}

private static void Remove(char c) {
  switch (c) {
    case 'A':
      if (myArr[0] == checkArr[0])
        checkSecret--;
      myArr[0]--;
      break;
    case 'C':
      if (myArr[1] == checkArr[1])
        checkSecret--;
      myArr[1]--;
      break;
    case 'G':
      if (myArr[2] == checkArr[2])
        checkSecret--;
      myArr[2]--;
      break;
    case 'T':
      if (myArr[3] == checkArr[3])
        checkSecret--;
      myArr[3]--;
      break;
  }
 }

}