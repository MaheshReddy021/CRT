import java.util.*;

public class buzznum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");

        int n = sc.nextInt();

        if(n%10 == 7 ||n%7== 0)
            System.out.println("It is Buzz number");
        else
            System.out.println("It is not a Buzz number");
    }
    
}
