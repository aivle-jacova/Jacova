import java.util.*;

class Solution {
    public List solution(int brown, int yellow) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < yellow / 2 + 1; i++) { // 옐로우 경우의 수만큼 for문 돌리기
            if (yellow % i == 0) {                  // yellow가 사각형 모양일 때
                if (brown == i*2 + ((yellow / i) + 2) * 2) { // 이 때 brown의 수와 같을 때
                    list.add((yellow / i) + 2);
                    list.add(i+2);
                    break;
                }
            }
        }
        
        if (list.isEmpty()) {
            list.add(3);
            list.add(3);
        }
        
        return list;
    }
}
