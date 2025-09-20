import java.util.Scanner;
public class twodarray {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[][] arr = new int[3][3];
    System.out.println(arr.length);

    // Taking user input
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = in.nextInt();
        }
    }

    // Printing array
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
    }
}
}
