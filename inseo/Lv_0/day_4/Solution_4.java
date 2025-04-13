public class Solution_4 {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.compareTo(">")==0){
            if(eq.compareTo("=")==0) return ((n>=m)?1:0);
            else return ((n>m)?1:0);
        }
        else{
            if(eq.compareTo("=")==0) return ((n<=m)?1:0);
            else return ((n<m)?1:0);
            
        }

    }
}
