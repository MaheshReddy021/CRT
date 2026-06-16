import java.util.*;

public class perfectsquare {
    public static void main(String args[]){
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int root = (int)Math.sqrt(n);

        if(root*root==n)
            System.out.println("It is a perfect square");
        else
            System.out.println("It is not a perfect square");
    }
    
}
