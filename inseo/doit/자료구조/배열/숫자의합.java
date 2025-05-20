import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String st=sc.next();
        char [] st1=st.toCharArray();
        int sum=0;

        for(int i=0;i<number;i++){
            sum+=st1[i]-'0';
        }
        System.out.println(sum);
    }

}