class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public int dfs(int[] numbers, int target, int index, int sum) {
        if (numbers.length == index) {
            if (target == sum) {
                return 1;
            } else {
                return 0;
            }
        }
        
        return dfs(numbers, target, index + 1, sum + numbers[index]) + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
    
}