1
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 공백 없이 입력 받음
        System.out.println(str); // 입력받은 문자열 그대로 출력
    }
}

2
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    

    }
}

3

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();   // 문자열 입력
        int n = sc.nextInt();     // 반복 횟수 입력

        StringBuilder result = new StringBuilder();  // 문자열 누적을 위한 StringBuilder 사용
        for (int i = 0; i < n; i++) {
            result.append(str);  // 문자열 str을 n번 누적
        }

        System.out.println(result.toString());  // 결과 출력
    }
}
4
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 입력 문자열
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            // 대문자 → 소문자, 소문자 → 대문자
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        System.out.println(result.toString()); // 결과 출력
    }
}
5
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    System.out.println("!@#$%^&*(\\'\"<>?:;");
    
    }
}






