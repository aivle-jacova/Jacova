// 1.완주하지 못한 선수 이름 반환
// 2. participant에서 completion 을 뺀 나머지 1명 반환 : participant-1 = completion
//    participant에서 completion에 포함되지 않은 사람 찾기
// 3. if ~

import java. util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

            
        // 두 배열이 다를 때까지 찾는다
        int i = 0;
        for(i=0; i<completion.length;i++)
            if(!participant[i].equals(completion[i])) // 두 배열이 같지않다면 빠져나옴. 
                break;


        // 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미
        return participant[i];
    }   
}
