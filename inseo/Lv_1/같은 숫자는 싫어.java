import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]==arr[i-1]) continue;
            st.push(arr[i]);
        }
        
        return st.stream().mapToInt(i -> i).toArray();
    }
}