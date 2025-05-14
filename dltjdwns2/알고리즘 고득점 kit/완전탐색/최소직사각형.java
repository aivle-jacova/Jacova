import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            x = x > sizes[i][0] ? x : sizes[i][0];
            y = y > sizes[i][1] ? y : sizes[i][1];
        }
        
        answer = x * y;
        
        return answer;
    }
}