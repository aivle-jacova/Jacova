import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2; // 전체 마릿수 나누기 2
        
        HashSet<Integer> set = new HashSet<>(); // 중복을 허용하지 않는 정수형 집합
        
        
        for(int num : nums) { 
            set.add(num);                       // nums의 모든 요소를 num에 추가 123?
        }
        
        int size = set.size();
        
        if(size >= len) {
            answer = len;
        }
        else {
            answer = size;
        }
        return answer; 
    }
}