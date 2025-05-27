package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1940_주몽 { 
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 주몽이 원하는 숫자 (목표값)
        int[] A = new int[N];                    // 재료 무게들을 담을 상자 (배열)

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken()); // 재료 하나씩 넣기 -- nextToken 숫자형식의 문자
        }

        Arrays.sort(A);                             // 재료들을 무게순으로 정렬 (작은 것부터 큰 것까지)

        int count = 0; // 몇 쌍이 나오는지 세는 숫자
        int i = 0;  //A[0] -> Min  시작 - 가장 가벼운 재료
        int j = N-1; //A[N-1]      끝  - 가장 무거운 재료

        while (i<j) {
            if(A[i]+A[j]<M) i++;
            else if (A[i]+A[j]>M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
