// 수열과 구간 쿼리 3
class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {
        
        int temp;
        
        for(int i = 0; i < queries.length; i++) {
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        
        return arr;
    }
}