import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int i=0;
        StringBuffer sb= new StringBuffer("");
        
        for (i=0;i<n;i++){
            sb.append(str);
        }
        System.out.println(sb);
    }
}