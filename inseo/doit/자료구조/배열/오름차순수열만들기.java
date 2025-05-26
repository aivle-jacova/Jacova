import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];
        int n1 = 1;

        StringBuffer bf = new StringBuffer();
        boolean result = true;

        for(int i = 0; i < n; i++){
            s[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int su = s[i]; // 현재 수열의 값
            if(su >= n1){
                while(su >= n1){
                    st.push(n1++);
                    bf.append("+\n");
                }
                st.pop();
                bf.append("-\n");
            } else {
                // Stack의 top이 입력값과 같아야 함
                if(st.peek() == su){
                    st.pop();
                    bf.append("-\n");
                } else {
                    System.out.println("NO");
                    result = false;
                    break;
                }
            }
        }
        if(result) System.out.print(bf.toString());
    }
}
