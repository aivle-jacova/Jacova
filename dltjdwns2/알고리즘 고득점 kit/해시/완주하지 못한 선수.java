import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String p : completion) {
            if (!map.containsKey(p)) {
                map.put(p, 1);
            } else {
                map.replace(p, map.get(p) + 1);
            }
        }
        
        for (String c : participant) {
            if (map.containsKey(c) && map.get(c) != 0) {
                map.replace(c, map.get(c) - 1);
            } else {
                answer = c;
                break;
            }
        }
        
        return answer;
    }
}