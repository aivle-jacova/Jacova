import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}