import java.util.*;

public class opsignornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a&b values :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a ^ b) < 0);
    }
}