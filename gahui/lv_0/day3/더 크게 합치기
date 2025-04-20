// 문자열 붙이기
// 문자열 변환: String.valueOf()를 사용하여 정수를 문자열로 변환
// 문자열 이어붙이기: + 연산자를 사용하여 문자열을 이어붙이기
// 정수 변환: Integer.parseInt()를 사용하여 문자열을 정수로 변환
// 비교 및 반환: Math.max()를 사용하여 두 정수 중 더 큰 값을 반환

class Solution {
    public int solution(int a, int b) {
        // 정수 a와 b를 문자열로 변환하여 이어붙임
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        // 두 문자열을 정수로 변환하여 비교
        int num1 = Integer.parseInt(ab);
        int num2 = Integer.parseInt(ba);

        // 더 큰 값을 반환 (같으면 num1 반환)
        return Math.max(num1, num2);
    }
}
