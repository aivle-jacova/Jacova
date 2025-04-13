import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a=sc.next();
        StringBuffer sb= new StringBuffer();
        
        for(char ch:a.toCharArray()){
            if('a'<=ch && ch<='z')
                sb.append((char)(ch-('a'-'A')));
            else
                sb.append((char)(ch+('a'-'A')));
        }
        System.out.println(sb.toString());
    }
}