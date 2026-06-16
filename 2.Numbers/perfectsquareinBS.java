import java.util.*;

public class perfectsquareinBS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");

        int n= sc.nextInt();

        int low=1,high=n;
        boolean found = false;

        while(low <= high){
           int mid = (low+high)/2;
            long square = (long)mid*mid;

            if(square == n){
                found = true;
                break;
            }
            else if(square<n)
                low = mid+1;
            else
                high = mid-1;

        }
        if(found)
            System.out.println("It is a perfect square");
        else
            System.out.println("It is not a perfect square");
    }

}
