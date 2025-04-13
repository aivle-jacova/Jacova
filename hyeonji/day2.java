1
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum); // 결과 출력
    }
}

2import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b); // 두 문자열을 이어서 출력

        
    }
}

3
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}

4

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 자연수 입력

        if (n % 2 == 0) {
            System.out.println(n + " is even");
      } else {
            System.out.println(n + " is odd");
        }
    }
}

5

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
String answer = my_string.substring(0, s)
                       + overwrite_string
                       + my_string.substring(s + overwrite_string.length());
    return answer;
    }
}