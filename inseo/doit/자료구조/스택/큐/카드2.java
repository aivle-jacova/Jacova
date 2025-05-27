import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //큐 생성
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        
        while(q.size()>1){
            q.remove();
            int top=q.peek();
            q.remove();
            q.offer(top);
        }
        
        System.out.println(q.peek());

    }
    
}
