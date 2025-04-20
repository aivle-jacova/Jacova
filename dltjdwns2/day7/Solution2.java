// 배열 만들기 2 (다른 문제 참고)
import java.util.*;

class Solution2 {
    public List solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean bool = true;
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    bool = false;
                }
            }
            if (bool) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}
