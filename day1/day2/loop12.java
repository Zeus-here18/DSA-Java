//Product of digits in a number

import java.util.Scanner;

public class loop12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int mul=1;
        int digit;
        int temp = num;
        while(temp > 0){
            digit = temp % 10;
            mul = mul * digit;
            temp = temp/10;
        }
        System.out.println(mul);

    }
    
}
