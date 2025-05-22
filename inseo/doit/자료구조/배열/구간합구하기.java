import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        //long [] nums = new long [n];
        int [] nums= new int[n];
        int [] new_nums=new int[n];
        int a,b;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
            new_nums[i]+=nums[i];
        }
        
        for(int q=0;q<m;q++){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());    
            System.out.println(new_nums[b-1]-new_nums[a-1]);
        }
    }
}
