import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine(); 
        br.close();


        Integer[] array = new Integer[N.length()];

        for(int i = 0; i < array.length; i++) {
            
            array[i] = N.charAt(i) - '0';
        }

        Arrays.sort(array, Collections.reverseOrder()); 

        for(int i = 0; i < array.length; i++) {
            bw.write(array[i]+""); 
        }

        bw.flush();
        bw.close();}
}
