import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack st= new Stack();
        char c='c';
        boolean answer = true;
        

        if(s.charAt(0)==')') {
            return false;
        }
        for(int i=0;i<s.length();i++){

            c=s.charAt(i);
            if(c=='(') st.push(c);    
            if(c==')') st.pop();
        }
        
        if (st.empty()) answer=true;
        else answer=false;
        
        
        return answer;
    }
}