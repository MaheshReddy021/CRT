import java.util.*;

public class missingvalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");   

        int n = sc.nextInt(); 

        int[] arr = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int x : arr) {
            xor ^= x;
        }

        System.out.println(xor);
    }
}