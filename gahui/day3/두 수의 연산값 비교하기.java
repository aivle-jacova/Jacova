// 두 숫자 a, b가 주어졌을 때, a ⊕ b는 a와 b를 문자열로 이어붙인 숫자
// 2 * a * b는 곱한 후 2배
// a ⊕ b와 2ab 중 더 큰 값을 리턴

class Solution {
    public int solution(int a, int b) {
        
        // a와 b를 문자열로 이어붙이고 정수로 변환
        String abStr = Integer.toString(a) + Integer.toString(b);
        int abConcat = Integer.parseInt(abStr);

        // 2 * a * b 계산
        int abProduct = 2 * a * b;

        // 비교 후 더 큰 값 리턴, 같으면 abConcat 리턴
        return Math.max(abConcat, abProduct);
    }
}