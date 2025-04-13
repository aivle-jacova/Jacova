// 문자열 곱하기
class Solution3 {
    public String solution3(String my_string, int k) {
        String answer = "";
        
        for(int i=0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}