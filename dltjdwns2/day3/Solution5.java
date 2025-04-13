// 두 수의 연산값 비교하기
class Solution5 {
    public int solution5(int a, int b) {
        int answer = 0;
        
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        
        int s3 = Integer.parseInt(s1+s2);
        int s4 = 2*a*b;
        
        answer = (s3 > s4) ? s3 : s4;
        
        return answer;
    }
}