import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char []c  = new char[a.length()];

        for (int i=0;i<c.length;i++){
            c[i]=a.charAt(i);
            System.out.println(c[i]);
        }


        
    }
}