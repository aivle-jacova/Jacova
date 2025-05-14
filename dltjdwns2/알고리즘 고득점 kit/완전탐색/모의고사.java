class Solution {
    public int[] solution(int[] answers) {
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        int n = 0;
        int p = 0;
        
        while (n < answers.length) {
            if (answers[n] == p1[p]) {
                c1 += 1;
            }
            n++;
            p++;
            
            if(p == p1.length) {
                p = 0;
            }
        }
        
        n = 0;
        p = 0;
        
        while (n < answers.length) {
            if (answers[n] == p2[p]) {
                c2 += 1;
            }
            n++;
            p++;
            
            if(p == p2.length) {
                p = 0;
            }
        }
        
        n = 0;
        p = 0;
        
        while (n < answers.length) {
            if (answers[n] == p3[p]) {
                c3 += 1;
            }
            n++;
            p++;
            
            if(p == p3.length) {
                p = 0;
            }
        }
        
        if (c1 > c2 && c1 > c3) {
            int[] answer = {1};
            return answer;
        } else if (c2 > c1 && c2 > c3) {
            int[] answer = {2};
            return answer;
        } else if (c3 > c1 && c3 > c2) {
            int[] answer = {3};
            return answer;
        } else if (c1 == c2 && c1 > c3) {
            int[] answer = {1, 2};
            return answer;
        } else if (c1 == c3 && c1 > c2) {
            int[] answer = {1, 3};
            return answer;
        } else if (c2 == c3 && c2 > c1) {
            int[] answer = {2, 3};
            return answer;
        }
        
        int[] answer = {1, 2, 3};
        return answer;
    }
}