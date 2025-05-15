import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int len = nums.length/2;
        for(int i : nums){
            hs.add(i);
        }
        
        
        if(len>=hs.size()) return hs.size();
        else return len;
    }
}