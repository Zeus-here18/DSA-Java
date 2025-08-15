//Count number of digits in a number

import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int count =0;
        if(n == 0){
            count = 1;
            System.out.println(count);
        }
        while(n > 0){
             n = n/10;
            count += 1;
        }
        System.out.println(count);
    }
    
}
