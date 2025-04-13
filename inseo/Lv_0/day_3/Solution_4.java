class Solution_4 {
    public int solution(int a, int b) {
        //문자로 바꾸기
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        //합치기
        String c1=s1.concat(s2);
        String c2=s2.concat(s1);
        //숫자로 변환
        a=Integer.parseInt(c1);
        b=Integer.parseInt(c2);
            
        //if값을 써서 비교
        if(a>b) return a;
        else return b;
}
}