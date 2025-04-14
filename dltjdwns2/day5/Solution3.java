// 주사위 게임 2
class Solution3 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && b == c) {
            answer = (a + b + c) * pow1(a, b, c) * pow2(a, b, c);
        } else if(a == b || b == c || c == a) {
            answer = (a + b + c) * pow1(a, b, c);
        } else {
            answer = (a + b + c);
        }
        
        
        return answer;
    }
    
    public int pow1(int a,int b,int c) {
        return (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }
                
    public int pow2(int a,int b,int c) {
        return (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
    }
}