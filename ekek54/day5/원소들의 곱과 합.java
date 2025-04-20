import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int product = Arrays.stream(num_list).reduce(1, (e1, e2) -> e1 * e2);
        int sumSquared = (int)Math.pow(Arrays.stream(num_list).sum(), 2);
        return product < sumSquared ? 1 : 0;
    }
}