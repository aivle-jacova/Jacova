// 어떤 번호-N개의 전화번호 -> 다른 번호의 접두어이면 false, 그렇지 않으면 true return

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Map<String, Integer> map = new HashMap<>();
        
        boolean answer = true; 

        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++)
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            
        return answer;
    }
}