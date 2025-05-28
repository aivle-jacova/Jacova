import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        //힙 생성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //1.overiding 2.(o1,o2)컴페레이터방식 비교하는방식 
        PriorityQueue<Integer> myQueue= new PriorityQueue<>((o1,o2)->{
            //절댓값 작은 데이터 우선
            //절댓값이 같으면 음수 출력
            int first_abs=Math.abs(o1);
            int second_abs=Math.abs(o2);
            if(first_abs==second_abs){
                return o1 > o2 ? 1:-1;
            }
            return first_abs-second_abs;
        });

        int x=Integer.parseInt(br.readLine());
        
        for(int i=0;i<x;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){
                if(myQueue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(myQueue.poll());
                }

            }
            else {
                myQueue.offer(num);
            }
            

        }

    }
    
}
