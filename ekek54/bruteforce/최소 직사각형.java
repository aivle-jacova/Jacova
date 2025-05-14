import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int longMax = Arrays.stream(sizes)
                .mapToInt(size -> Arrays.stream(size).max().getAsInt())
                .max().getAsInt();
        int shortMax = Arrays.stream(sizes)
                .mapToInt(size -> Arrays.stream(size).min().getAsInt())
                .max().getAsInt();

        return longMax * shortMax;
    }
}