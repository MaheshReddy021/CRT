import java.util.*;

public class onoffbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n & k values :");

        int n = sc.nextInt(); 
        int k = sc.nextInt(); 

        System.out.println("ON     : " + (n | (1 << k)));
        System.out.println("OFF    : " + (n & ~(1 << k)));
        System.out.println("TOGGLE : " + (n ^ (1 << k)));
        System.out.println("CHECK  : " + ((n & (1 << k)) != 0));
    }
}