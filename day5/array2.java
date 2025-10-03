import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter numbers: ");
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter a number to find: ");

        int x = sc.nextInt();
        
        for(int i = 0; i< size; i++){
            if(x == numbers[i]){
                System.out.println("Elements found at index " + i);
            }
        }

        

    }
    
}
