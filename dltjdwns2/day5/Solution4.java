// 이어 붙인 수
class Solution5 {
    public int solution(int[] num_list) {
        int answer = 0;
        String s1 = "";
        String s2 = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                s1 += String.valueOf(num_list[i]);
            } else {
                s2 += String.valueOf(num_list[i]);
            }
        }
        
        answer = Integer.valueOf(s1) + Integer.valueOf(s2);
        
        return answer;
    }
}