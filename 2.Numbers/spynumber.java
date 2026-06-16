import java.util.*;

public class spynumber {
    public static void main(String args[]){
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0,product = 1,digit;
        int temp = num;

        while(temp>0){
            digit = temp%10;
            sum += digit;
            product *= digit;
            temp /= 10;

        }
        if(sum==product)
            System.out.println("It is a spy number");
        else
            System.out.println("It is not a spy number");
    }
    
}
