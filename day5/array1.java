import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Step 2: Declare an integer array of that size
        int[] numbers = new int[size];

        // Step 3: Loop to get input for each element of the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 4: Loop to print each element of the array
        System.out.println("The numbers in the array are:");
        for (int i = 0; i < size; i++) {
            // Use numbers[i] to print the element at the current index
            System.out.println(numbers[i]);
        }
        
        sc.close(); // Good practice to close the scanner
    }
}