import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            // 부분 배열 추출
            int[] subArray = Arrays.copyOfRange(array, i-1, j);
            
            // 부분 배열 정렬
            Arrays.sort(subArray);
            
            // k번째 요소 추가 (인덱스는 0부터 시작하므로 k-1)
            result.add(subArray[k-1]);
        }
        
        // List<Integer>를 int[]로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}