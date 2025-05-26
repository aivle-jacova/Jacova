package 실습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class p1874_수열만들기 {
    static Stack<Integer> st = new Stack<>();
    static int tmp=1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // + or - 를 모아두기 위한 공간 => 마지막에 한꺼번에 출력하기 위해 사용

        for(int i=0;i<C;i++) {
            int N=Integer.parseInt(br.readLine());
            for(;tmp<=N;tmp++) {
                st.push(tmp);
                sb.append("+\n");
            }
            if(st.peek()==N) {
                st.pop();
                sb.append("-\n");
            }else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);

    }

}