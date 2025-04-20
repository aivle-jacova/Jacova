// 문자열 여러 번 뒤집기 (다른 문제 참고)
import java.util.Arrays;

class Solution5 {
    public String solution(String my_string, int[][] queries) {
        String[] arr = my_string.split("");
        
        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
             while (start < end) { // swap
                 String temp = arr[start];
                 arr[start] = arr[end];
                 arr[end] = temp;
                 
                 start++;
                 end--;
            }
        }
        String answer = String.join("", arr);
        
        return answer;
    }
}