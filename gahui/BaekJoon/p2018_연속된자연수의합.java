package 실습;

import java.util.Scanner;

public class p2018_연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int start_index = 1; 
        int end_index = 1;
        int sum = 1;

        while(end_index != N ){
            if(sum == N) {
                count++; end_index++; sum = sum + end_index; // 새롭게 들어온 애를 확장하고 sum에 더하기
            } else if (sum > N) {
                sum = sum - start_index; // 기존에 있던 애를 빼고, 오른쪽으로 한 칸 이동
                start_index++;
            }else {
                end_index++; sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
