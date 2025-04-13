class Solution_3 {
    public int solution(int n) {
        
        //홀수면 반복문으로 sum에 제곱값 그 값까지 담기
        if(n%2 ==0){
            int sum=0;
            for(int i=0;i<=n;i++){
                if(i%2==0) sum+=i*i;
            }
            return sum;
        }
        else{
            int sum=0;
            for(int i=0;i<=n;i++){
                if(i%2!=0) sum+=i;
                else
            }
            return sum;
            
        }

    }
}