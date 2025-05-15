// 문자열 str과 정수 n을 입력받고, str을 n번 반복해서 이어 붙인 결과를 출력하는 코드.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();                 // 문자열 str과 정수 n을 입력받고,
        int n = sc.nextInt();
        String a = "";                          // 공백으로 초기화 시켜주고

        StringBuilder sb = new StringBuilder(); // 문자열 누적용 객체 생성
        
        for(int i=0; i<n; i++){
            sb.append(str);                     // 문자열 반복해서 붙임
        }
        
        System.out.println(sb.toString());
        
    }
}