import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        long [] nums=new long [N];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            nums[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(nums);

        int count = 0,p=0;
        int q=N-1;
        while(p<q) {
            if (nums[p] + nums[q] > M) q--;
            else if (nums[p] + nums[q] < M) p++;
            else {
                count++;
                p++;
                q--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
