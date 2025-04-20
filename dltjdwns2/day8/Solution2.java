// 주사위 게임 3
import java.util.*;
import java.lang.Math;

class Solution2 {
    public double solution(int a, int b, int c, int d) {
        double answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        if(arr[0] == arr[1]) {
            if(arr[1] == arr[2]) {
                if(arr[2] == arr[3]) {          // 모든 숫자가 같을 떄
                    answer = 1111 * arr[0];
                } else {                        // 3, 1일 때
                    answer = Math.pow(10 * arr[0] + arr[3], 2); 
                }
            }else {
                if(arr[2] == arr[3]) {          // 2, 2일 때
                    answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
                }else {                         // 2, 1, 1일 때
                    answer = arr[2] * arr[3];
                }
            }
        }else {
            if(arr[1] == arr[2]) {
                if(arr[2] == arr[3]) { // 1, 3일 때
                    answer = Math.pow(10 * arr[3] + arr[0], 2); 
                }else {                 // 1, 2, 1 일 때
                    answer = arr[0] * arr[3];
                }
            }else {
                if(arr[2] == arr[3]) { // 1, 1, 2일 때
                    answer = arr[0] * arr[1];
                }else {                // 1, 1, 1, 1일 때
                    answer = arr[0];
                }
            }
        }
        
        return answer;
    }
}