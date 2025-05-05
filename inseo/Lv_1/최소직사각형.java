class Solution {
    public int solution(int[][] sizes) {
        int x_max = 0;
        int y_max = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            if (sizes[i][0] > x_max) x_max = sizes[i][0];
            if (sizes[i][1] > y_max) y_max = sizes[i][1];
        }
        
        return x_max * y_max;
    }
}