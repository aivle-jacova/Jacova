// 대소문자 바꿔서 출력하기
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String ans = "";
        
        for(int i=0; i < a.length(); i++){
            b = a.charAt(i);
            
            if(Character.isUpperCase(b)) {
                ans += Character.toLowerCase(b);
            } else {
                ans += Character.toUpperCase(b);
            }
        }
        System.out.print(ans);
    }
}