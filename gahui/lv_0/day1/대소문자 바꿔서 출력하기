// 알파벳 대문자 > 소문자, 소문자 > 대문자 변환 코드 작성
// 무엇을 사용할 것인가? 


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 1. 사용자 입력을 받을 준비
        String a = sc.next();                       // 2. 입력값 하나 받아서 문자열 변수 'a'에 저장

        String answer = "";                         // 3. 결과를 저장할 문자열 초기화

        for (int i=0; i<a.length(); i++) {          // 4. 문자열 a의 모든 문자 하나씩 반복
            char c = a.charAt(i);                   // 5. i번째 문자를 변수 c에 저장
            if (Character.isUpperCase(c)) {         // 6. 만약 c가 대문자라면
                answer += Character.toLowerCase(c); // 7. 소문자로 바꿔서 answer에 추가
            } else {                               
                answer += Character.toUpperCase(c); // 8. 아니라면 (즉, 소문자면) 대문자로 바꿔서 추가
            }
        }

        System.out.println(answer);                 // 9. 최종 결과 출력
    }
}
