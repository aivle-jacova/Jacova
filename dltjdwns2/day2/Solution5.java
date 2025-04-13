// 문자열 겹쳐쓰기
class Solution {
    public String solution5 (String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        
        if(my_string.length() > s + overwrite_string.length()) {
            answer += my_string.substring(s + overwrite_string.length());
        }
        
        return answer;
    }
}