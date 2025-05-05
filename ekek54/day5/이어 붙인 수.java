class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder oddStringBuilder = new StringBuilder();
        StringBuilder evenStringBuilder = new StringBuilder();

        for (int num: num_list) {
            if (num % 2 == 0) {
                evenStringBuilder.append(num);
            } else {
                oddStringBuilder.append(num);
            }
        }
        // 최소 1개의 홀/짝 존재
        int odd = Integer.parseInt(oddStringBuilder.toString());
        int even = Integer.parseInt(evenStringBuilder.toString());
        return odd + even;
    }
}