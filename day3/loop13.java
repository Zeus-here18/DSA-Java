//Q1> Prime or not.

import java.util.*;

public class loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num < 1){
            System.out.println("Neither Prime nor Composite");
        }else{
        boolean isPrime = true;
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){ 
                 isPrime = false;
                break;
            }
        }
        if (isPrime)
         System.out.println("it is a prime number");
            else
             System.out.println("Not prime number");
        }

    }
    
}
