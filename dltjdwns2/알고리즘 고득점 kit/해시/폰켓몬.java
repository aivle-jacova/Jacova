import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int t = nums.length / 2;
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) { // 해시맵 안에 키가 없을 때
                map.put(nums[i], 1); // 해시맵에 키, 1 추가
            } else { // 해시맵 안에 키가 있을 때
                map.put(nums[i], map.get(nums[i]) + 1); // 밸류 값 증가
            }
        }
        
        for (int i = 0; i < t; i++) {
            Integer firstKey = map.keySet().iterator().next(); // 해시맵 안에 임의의 키값
            
            map.remove(firstKey); // 해시맵에서 임의의 키값에 해당하는 키, 밸류 삭제
            answer++; // 카운트 증가
            
            if (map.isEmpty()) { // 해시맵이 비었을 때 탈출
                break;
            }
        }

        return answer;
    }
}