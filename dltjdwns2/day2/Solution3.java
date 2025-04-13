// 문자열 돌리기
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            System.out.println(b);
        }
    }
}