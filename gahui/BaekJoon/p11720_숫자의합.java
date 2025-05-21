import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11720_숫자의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] str = br.readLine().split("");
        br.close();

        for(int i=0;i<n;i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}