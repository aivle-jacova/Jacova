import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > max) max = nums[i];
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) nums[i] / max * 100;
        }

        System.out.println(sum / n);
    }
}
