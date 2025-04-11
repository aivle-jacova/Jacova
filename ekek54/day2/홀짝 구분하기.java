import java.util.*;
import java.io.*;

public class Solution {
    private static final String oddFormat = "%d is odd";
    private static final String evenFormat = "%d is even";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String format = n % 2 == 0 ? evenFormat : oddFormat;
        System.out.printf(format, n);
    }
}