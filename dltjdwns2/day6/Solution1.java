// 마지막 두 원소
class Solution1 {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        if(num_list[n-2] < num_list[n-1]) {
            answer[answer.length - 1] = num_list[n-1] - num_list[n-2];
        } else {
            answer[answer.length - 1] = num_list[n-1] * 2;
        }
        return answer;
    }
}