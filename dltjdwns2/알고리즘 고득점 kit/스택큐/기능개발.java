import java.util.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int n = (100 - progresses[i]) / speeds[i];
            
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add(n);
            } else {
                queue.add(n + 1);
            }
        }
        
        while(!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;
            
            
            
            while(!queue.isEmpty() && day >= queue.peek()) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        
        return answer;
    }
}