// 9로 나눈 나머지
class Solution4 {
    public int solution(String number) {
        int answer = 0;
        String num = "";
        
        for(int i = 0; i < number.length(); i++) {
            
            answer += number.charAt(i) - '0';
        }
        
        answer = answer % 9;
        
        return answer;
    }
}