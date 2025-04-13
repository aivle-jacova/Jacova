import java.util.Scanner;


class Solution_5 {
    public static StringBuffer solution(String my_string, String overwrite_string,int s) {    
        StringBuffer s1=new StringBuffer(my_string);
        
        s1.delete(s,s+overwrite_string.length());
        s1.insert(s,overwrite_string);

        System.out.println(s1);

        return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String my_string =sc.next();
        String overwrite_string =sc.next();
        int s=sc.nextInt();

        StringBuffer answer=new StringBuffer();
        answer=solution(my_string,overwrite_string,s);
        System.out.println(answer);
    }

}