class Solution_5{
    public int solution(int a, int b) {
        int a1=2*a*b;  
        //문자로 바꾸기
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        //합치기
        String c1=s1.concat(s2);
        //숫자로 변환
        a=Integer.parseInt(c1);
        //if값을 써서 비교
        if(a>=a1) return a;
        else return a1;
    }
}