// 더 크게 합치기
class Solution4 {
    public int solution4(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        int s3 = Integer.valueOf(s1+s2);
        int s4 = Integer.valueOf(s2+s1);
        
        if(s3 > s4) {
            return s3;
        } else {
            return s4;
        }
    }
}
