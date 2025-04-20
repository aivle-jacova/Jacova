// 콜라츠 수열 만들기
import java.util.*;

class Solution4 {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        while(n != 1) {
            answer.add(n);
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        answer.add(1);
        
        return answer;
    }
}