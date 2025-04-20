// my_string의 s~overwrite_string 길이만큼 => overwrite_string로 바꿔 리턴
// for문을 문자열 길이가 끝날 때까지 돌림 > if 문자가 숫자이면 overwrite_string > if 1 <= overwrite_string 길이
// my_string: 원본 문자열
// overwrite_string: 덮어쓸 문자열
// s: 덮어쓰기 시작 위치 (인덱스)

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int l = overwrite_string.length();  // 덮어쓸 문자열의 길이
        int l2 = my_string.length();        // 원본 문자열의 길이

                                            // 원본 문자열의 s 위치에서 덮어쓸 문자열을 삽입하고 나머지 부분을 이어 붙임
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+l, l2);
// 원본 문자열의 처음부터 s 인덱스까지의 부분 문자열을 가져오고 덮어쓴 후, 원본 문자열의 s + l (덮어쓴 문자열의 길이만큼 이동한 위치)부터 끝까지의 부분 문자열을 가져옴
        return answer;                      // 최종 결과 문자열 반환
    }
}
