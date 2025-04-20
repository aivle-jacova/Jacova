// 공배수
class Solution2 {
    public int solution2(int number, int n, int m) {
        
        if(number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}