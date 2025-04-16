// 수열과 구간 쿼리 2
class Solution5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        boolean min = false;
        
        for(int i = 0; i < queries.length; i++) {
            int num = -1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    if(min == false) {
                        num = arr[j];
                        min = true;
                    } 
                    else num = (num > arr[j]) ? arr[j] : num;
                }
            }
            answer[i] = num;
            min = false;
        }
        
        return answer;
    }
}